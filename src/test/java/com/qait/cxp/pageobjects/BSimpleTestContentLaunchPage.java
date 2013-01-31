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

	@FindBy(xpath = "//div/div[1]")
	private WebElement simpleActivityTitle;

	@FindBy(xpath = "//*[contains(@id, 'easyXDM_default')]")
	private WebElement activityFrame;

	@FindBy(xpath = "/html/body/div/div[5]/div/div/div[4]/div")
	private WebElement firstQuestionText;
	
	@FindBy(css="div.title-bar")
	private WebElement TakeAssingmentHeader;
	
	@FindBy(how=How.CSS, using="a.assignment-button.show-scores")
	private WebElement showScoreButton;

	public void verifySimpleTestContentPageHeader() throws Exception {
		waitForElementToBeVisible(simpleActivityTitle);
		String str = simpleActivityTitle.getText();
		System.out.println("Test1 of Simple Page" + str);
	}
	
	public void getScoreButtonTextAndClick(){
		waitForElementToBeVisible(showScoreButton);
		System.out.println("Header Text Is:- " + showScoreButton.getText());
		showScoreButton.click();
	}
}
