package com.qait.cxp.keywords;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import com.qait.cxp.pageobjects.ALaunchActivityPage;
//import com.qait.cxp.dataprovider.CxpDataProvider;

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
	
	public void verifySelectXmlandLoad() throws Exception {
		Select clickThis = new Select(presetsDropDown);
		clickThis.selectByVisibleText("Chemistry \"simple\" with test content");
		waitForElementToBeVisible(takeactivityButton);
		Thread.sleep(1000);
		Assert.assertTrue(activityXmlTextArea.getAttribute("value").endsWith("</activity>"));

	}
	
	public void clickTakeActivity() throws Exception{
		takeactivityButton.click();
		System.out.println("Test3 of load is executed");
	}
	
	
	
	
	
	
	
	/**
	 * Method to read xml from resource file
	 * @throws Exception
	 */
	/*	public String getXmlFromFile(String filename) throws Exception {
			CxpDataProvider object = new CxpDataProvider();
			String activityXml= object.getXmlFromFile(filename);
			return activityXml;
		}*/

	/*	public void verifySelectXmlandLoad() throws Exception {
			//Select clickThis = new Select(presetsDropDown);
			//clickThis.selectByVisibleText("Chemistry \"simple\" with test content");
			activityXmlTextArea.clear();
			
			activityXmlTextArea.sendKeys(getXmlFromFile("roundSF.txt"));
			waitForElementToBeVisible(takeactivityButton);
			Thread.sleep(10000);
			Assert.assertTrue(activityXmlTextArea.getAttribute("value").endsWith("</activity>"));

		}
	*/
}
