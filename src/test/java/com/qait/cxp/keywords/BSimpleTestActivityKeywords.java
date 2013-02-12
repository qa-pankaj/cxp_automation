package com.qait.cxp.keywords;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qait.cxp.pageobjects.BSimpleTestContentLaunchPage;

public class BSimpleTestActivityKeywords extends BSimpleTestContentLaunchPage{

	public BSimpleTestActivityKeywords(WebDriver driver)throws Exception{
		super(driver);
	
	}
	public String verifySimpleTestContentPageHeader() throws Exception {
		System.out.println("check page header method");
		Thread.sleep(1000);
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
	
	
	public void getScoreButtonTextAndClick(){
		waitForElementToBeVisible(showScoreButton);
		System.out.println("Header Text Is:- " + showScoreButton.getText());
		showScoreButton.click();
	}
	
}
