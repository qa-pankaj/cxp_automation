package com.qait.cxp.pageobjects;

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

	@FindBy(xpath = "//*[contains(@id, 'easyXDM_default')]")
	protected WebElement frameApp;

	@FindBy (css="div.buttton.submit-button.enabled")
	protected WebElement SubmitAnswerButton;
	
	@FindBy (css="div.topbutton.review-topic.enabled")
	protected WebElement reviewTopicButton;
	
	@FindBy (css="a.popupItem")
	protected WebElement reviewTopicItem;

	@FindBy (css="div.ci-question")
	protected WebElement reviewTopicPopUp;
	
}