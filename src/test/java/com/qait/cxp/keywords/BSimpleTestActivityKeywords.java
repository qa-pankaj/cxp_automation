package com.qait.cxp.keywords;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.qait.cxp.pageobjects.BSimpleTestContentLaunchPage;

public class BSimpleTestActivityKeywords extends BSimpleTestContentLaunchPage {

	public BSimpleTestActivityKeywords(WebDriver driver) throws Exception {
		super(driver);

	}

	public String verifySimpleTestContentPageHeader() throws Exception {
		System.out.println("check page header method for SimpleTest Page");
		waitForElementToBeVisible(simpleActivityTitle);
		String str = simpleActivityTitle.getText();
		System.out.println("Test1 of Simple Page" + str);
		return str;
	}
	
	
	public Boolean verifyShowScoresButtonIsActive() throws Exception {
		return showScoreButton.isEnabled();
			}
		public Boolean verifyReviewButtonIsActive() throws Exception {
			return reviewButton.isEnabled();
		}
		public Boolean verifyNewTestButtonIsActive() throws Exception {
		return newTestButton.isEnabled();
		}
	
		
	public String verifyFirstItemIsLoaded() throws Exception {
		waitForElementToBeVisible(frameApp);
		driver.switchTo().frame(frameApp);
		waitForElementToBeVisible(firstQuestionText);
		String str = firstQuestionText.getText();
		System.out.println(str);
		return str;
	}

	public Boolean verifyReviewTopicButtonIsEnabled() throws Exception {
		// driver.switchTo().frame(frameApp);
		waitForElementToBeVisible(reviewTopicButton);
		return reviewTopicButton.isEnabled();
	}

	public Boolean verifyClickingOnReviewTopicButtonShowsReviewTopics()
			throws Exception {
		reviewTopicButton.click();
		waitForElementToBeVisible(reviewTopicItem);
		return reviewTopicItem.isEnabled();
	}

	public String verifyClickingOnReviewTopicShowsReviewTopicPage()
			throws Exception {
		reviewTopicItem.click();
		Thread.sleep(300);
		waitForElementToBeVisible(reviewTopicPopUp);
		String reviewText = reviewTopicPopUp.getText();
		System.out.println("reviewtopic text is" + reviewText);
		return reviewText;
	}

	public Boolean verifyCloseReviewTopics() throws Exception {
		closeReviewTopic.click();
		Thread.sleep(300);
		waitForElementToBeVisible(reviewTopicItem);
		return reviewTopicItem.isEnabled();
	}

	public Boolean verifyShowHintButtonIsEnabled() throws Exception {
		waitForElementToBeVisible(showHintButton);
		return showHintButton.isEnabled();
	}

	public String verifyClickingOnShowHintButtonShowsHint() throws Exception {
		showHintButton.click();
		waitForElementToBeVisible(sampleHint);
		String hintText = sampleHint.getText();
		System.out.println("hint text is " + hintText);
		System.out.println("sample hint is displayed? "
				+ sampleHint.isDisplayed());

		return hintText;
	}

	public String verifyShowHintIsChangedToHideHint() throws Exception {
		String hintButtonText = hideHintButton.getText();
		System.out.println("hide hint text " + hintButtonText);
		return hintButtonText;
	}

	public Boolean verifyClickingOnHideHintClosesHint() throws Exception {
		hideHintButton.click();
		System.out.println("Is Sample Hint displayed "
				+ sampleHint.isDisplayed());
		return sampleHint.isDisplayed();
	}

	public Boolean verifyReferencesButtonIsEnabled() throws Exception {
		waitForElementToBeVisible(referencesButton);
		return referencesButton.isEnabled();
	}

	public Boolean verifyClickOnReferencesButtonShowsReferencesList(
			String referenceItems) throws Exception {
		String[] expectedReferenceList = referenceItems.split(";");
		referencesButton.click();
		waitForElementToBeVisible(referencesList);
		System.out.println("expected list size is "
				+ expectedReferenceList.length);
		/*
		 * int sizeOfList = referencesListItems.size(); ArrayList<String>
		 * actualReferenceList = new ArrayList<String>(); for (int i=0;
		 * i<sizeOfList; i++){
		 * actualReferenceList.add(referencesListItems.get(i).getText()); } for
		 * (String item : actualReferenceList){ System.out.println(item); }
		 */
/*		for (int i = 0; i < expectedReferenceList.length; i++) {
			if (expectedReferenceList[i].equals(referencesListItems.get(i)
					.getText())) {
				System.out.println("expected " + expectedReferenceList[i]);
				System.out.println("actual "
						+ referencesListItems.get(i).getText());
			}
		}*/
		for (int i = 0; i < expectedReferenceList.length; i++) {
			if (!expectedReferenceList[i].equals(referencesListItems.get(i)
					.getText())) {
				System.out.println("expected " + expectedReferenceList[i]);
				System.out.println("actual "
						+ referencesListItems.get(i).getText());
				return false;
			}
		}
		return true;
	}

	public Boolean verifyClickingOnReferencesShowsReferencesPage (String referenceItems) throws Exception{
		String[] expectedReferenceList = referenceItems.split(";");
		System.out.println("expected reference list size " +expectedReferenceList.length);
		String HandleBefore = driver.getWindowHandle();
		for (int i=0; i<expectedReferenceList.length; i++){
		referencesListItems.get(i).click();
		Thread.sleep(1000);
		for (String Handle : driver.getWindowHandles()) {
		        driver.switchTo().window(Handle);}
		String windowTitle = driver.getTitle();
		 System.out.println("in next window "+windowTitle);
		 driver.close();
		 driver.switchTo().window(HandleBefore);
		 driver.switchTo().frame(frameApp);
		 if (!expectedReferenceList[i].equals(windowTitle)) {
				System.out.println("expected title" + expectedReferenceList[i]);
				System.out.println("actual title"
						+ windowTitle);
				return false;
			}

		}			
	return true;
	}
	
	public Boolean verifySubmitAnswerButtonOnMultipleChoiceItemBeforeSubmitIsActive() throws Exception {
			System.out.println(" verifySubmitAnswerButtonOnMultipleChoiceItemBeforeSubmitIsActive" );
			return submitAnswerButtonEnabled.isEnabled();
	}
	

	public Boolean verifyTryAnotherButtonOnMultipleChoiceItemBeforeSubmitIsInactive() throws Exception {
		System.out.println(" verifyTryAnotherButtonOnMultipleChoiceItemBeforeSubmitIsInactive" );
			return retryButtonDisabled.isDisplayed();
	}
	
	public Boolean verifyNextLinkOnMultipleChoiceFirstItemIsActive () throws Exception{
		System.out.println(" verifyNextLinkOnMultipleChoiceFirstItemIsActive" );
		return nextLink.isEnabled();
	}
	
	public Boolean verifyPrevLinkOnMultipleChoiceFirstItemIsNotPresent () throws Exception{
		System.out.println(" verifyPrevLinkOnMultipleChoiceFirstItemIsNotPresent" );
		System.out.println(assertElementNotPresent("div.sel-prev.enabled"));
		return assertElementNotPresent("div.sel-prev.enabled");
		
	}
	
	public Boolean verifySubmittingIncorrectAnswerForMultipleChoiceShowsIncorrectRejoinder() throws Exception {
		mcIncorrectRadioButton.click();
		submitAnswerButtonEnabled.click();
		//System.out.println(mcIncorrectRadioButton.isEnabled());
		return null;
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void getScoreButtonTextAndClick() {
		waitForElementToBeVisible(showScoreButton);
		System.out.println("Header Text Is:- " + showScoreButton.getText());
		showScoreButton.click();
	}

}