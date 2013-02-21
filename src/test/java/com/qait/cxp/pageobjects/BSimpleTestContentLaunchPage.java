package com.qait.cxp.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BSimpleTestContentLaunchPage extends AbstractPage {

	//WebDriver driver;

	public BSimpleTestContentLaunchPage(WebDriver driver) {
		super(driver);
		System.out.println("Object initialized for SimpleTest Page");
	}

	@FindBy(css = "div.page-heading")
	protected WebElement simpleActivityTitle;

	@FindBy(xpath = "//*[contains(@id, 'easyXDM_default')]")
	protected WebElement activityFrame;

	@FindBy(xpath = "/html/body/div/div[5]/div/div/div[4]/div")
	protected WebElement firstQuestionText;

	@FindBy(css="div.title-bar")
	protected WebElement TakeAssingmentHeader;

	@FindBy(how=How.CSS, using="a.assignment-button.show-scores")
	protected WebElement showScoreButton;

	@FindBy(how=How.CSS, using="a.assignment-button.review-button")
	protected WebElement reviewButton;
	
	@FindBy(how=How.CSS, using="a.assignment-button.exit-button")
	protected WebElement newTestButton;
	
	@FindBy(xpath = "//*[contains(@id, 'easyXDM_default')]")
	protected WebElement frameApp;

	@FindBy (css="div.buttton.submit-button.enabled")
	protected WebElement SubmitAnswerButton;
	
	@FindBy (css="div.topbutton.review-topic.enabled")
	protected WebElement reviewTopicButton;
	
	@FindBy (css="div.dropdown > div > div.topics > a.popupItem")
	/*@FindBy (xpath="/html/body/div[3]/div[19]/div/div/a")*/
	protected WebElement reviewTopicItem;

	//@FindBy (xpath="//div[@className='covalent-item covalent-item-narrative']//div[@className='ci-question']")
	//@FindBy (xpath="//*[starts-with(@id, 'a')]/div/div")
	/*	"div#acb61df96048fb0.covalent-item.covalent-item-narrative")
	\				  a495e9fc006804f
					  a775f1fb605702a*/
	@FindBy (xpath="/html/body/div[3]/div[21]/div[2]/div/div/div/div")
	protected WebElement reviewTopicPopUp;
	
	@FindBy (css="div.popupCloseButton")
	protected WebElement closeReviewTopic;
	
	@FindBy (css="div.hints-button.enabled")
	protected WebElement showHintButton;
	
	@FindBy (css="div.activity > div.upslider > div > div.ci-popup > div.body")
	protected WebElement sampleHint;
	
	@FindBy (css="div.activity > div.upslider > div > div.hints-button.enabled")
	protected WebElement hideHintButton;
	
	@FindBy (css="div.references-button.enabled")
	protected WebElement referencesButton;
	
	@FindBy (css="div.activity > div.upslider > div > div.references")
	protected WebElement referencesList;
	
	@FindBy (css="div.activity > div.upslider > div > div.references > a")
	protected List <WebElement> referencesListItems;
	
	@FindBy (css="div.button.submit-button.enabled")
	protected WebElement submitAnswerButtonEnabled;
	
	@FindBy (css="div.button.retry-button.enabled")
	protected WebElement retryButtonEnabled;

	@FindBy (css="div.button.retry-button")
	protected WebElement retryButtonDisabled;
	
	@FindBy (css="div.button.submit-button")
	protected WebElement submitAnswerButtonDisabled;
	
	@FindBy (css="div.sel-prev.enabled")
	protected WebElement prevLink;
	
	@FindBy (css="div.sel-next.enabled")
	protected WebElement nextLink;
	
	//@FindBy (css="div.ci-content > div.ci-choices > div.ci-choice > span.ci-choice-indicator > input.ci-input > ")
	@FindBy (xpath="//*[contains (@value, '2')]")
	protected WebElement mcIncorrectRadioButton;
	
	@FindBy (xpath="//*[contains(@value, '8')]")
	protected WebElement mcCorrectRadioButton;

	
	
	
	
}