package com.qait.cxp.keywords;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.qait.cxp.pageobjects.ALaunchActivityPage;

public class ALaunchActivityKeywords extends ALaunchActivityPage{
	
	public ALaunchActivityKeywords(WebDriver driver) {
		super(driver);
	}
	
	public void verifyActivityPageHeader() throws Exception {
		System.out.println("Test1is called");
		System.out.println(pageHeading);
	}

	public void verifyActivityXmlActive() throws Exception {
		System.out.println("Test2");
	}

	public void verifyPresetsDropDownActive() throws Exception {
		System.out.println("Test3");
	}
	
	public void logingtotheapplication(){
		
	}

	public void verifySelectXmlandLoad() throws Exception {
		Select clickThis = new Select(presetsDropDown);
		clickThis.selectByVisibleText("Chemistry \"simple\" with test content");
		waitForElementToBeVisible(takeactivityButton);
		Thread.sleep(1000);
		Assert.assertTrue(activityXmlTextArea.getAttribute("value").endsWith("</activity>"));

	}
	
	public void clickTackAssignment(){
		takeactivityButton.click();
		System.out.println("Test3 of load is executed");
	}
}
