package com.qait.cxp.keywords;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qait.cxp.pageobjects.BSimpleTestContentLaunchPage;

public class BSimpleTestActivityKeywords extends BSimpleTestContentLaunchPage{

	public BSimpleTestActivityKeywords(WebDriver driver)throws Exception{
		super(driver);

	}
	public String verifySimpleTestContentPageHeader() throws Exception {
		System.out.println("check page header method for SimpleTest Page");
		waitForElementToBeVisible(simpleActivityTitle);
		String str = simpleActivityTitle.getText();
		System.out.println("Test1 of Simple Page" + str);
		return str;
	}

	public String verifyFirstItemIsLoaded() throws Exception {
		waitForElementToBeVisible(frameApp);
		driver.switchTo().frame(frameApp);
		waitForElementToBeVisible(firstQuestionText);
		String str = firstQuestionText.getText();
		System.out.println (str);
		return str;
	}

	public Boolean verifyReviewTopicButtonIsEnabled () throws Exception{	
		//driver.switchTo().frame(frameApp);
		waitForElementToBeVisible(reviewTopicButton);
		return reviewTopicButton.isEnabled();
	}
	
	public Boolean verifyClickingOnReviewTopicButtonShowsReviewTopics () throws Exception {
	reviewTopicButton.click();
	waitForElementToBeVisible(reviewTopicItem);
	return reviewTopicItem.isEnabled();
	}	
	
	public String verifyClickingOnReviewTopicShowsReviewTopicPage () throws Exception{	
	reviewTopicItem.click();
	Thread.sleep(300);
	waitForElementToBeVisible(reviewTopicPopUp);
	String reviewText = reviewTopicPopUp.getText();
	System.out.println("reviewtopic text is"+ reviewText);
	return reviewText;
	}
	
	public Boolean verifyCloseReviewTopics () throws Exception{	
	closeReviewTopic.click();
	Thread.sleep(300);
	waitForElementToBeVisible(reviewTopicItem);
	return reviewTopicItem.isEnabled();
	}
	
	public void getScoreButtonTextAndClick(){
		waitForElementToBeVisible(showScoreButton);
		System.out.println("Header Text Is:- " + showScoreButton.getText());
		showScoreButton.click();
	}

}