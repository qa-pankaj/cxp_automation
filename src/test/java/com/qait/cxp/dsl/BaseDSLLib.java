package com.qait.cxp.dsl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.qait.cxp.keywords.ALaunchActivityKeywords;
import com.qait.cxp.keywords.BSimpleTestActivityKeywords;
import com.qait.cxp.pageobjects.ALaunchActivityPage;
import com.qait.cxp.pageobjects.BSimpleTestContentLaunchPage;

public class BaseDSLLib {

	protected static WebDriver driver;
	protected static ALaunchActivityKeywords lnchActPageObject;
	protected static BSimpleTestActivityKeywords simpTestPageObject;
	
	
/*	protected String actualResult;
	protected String expectedResult;
	protected Boolean actualBooleanResult;
	protected Boolean expectedBooleanResult;*/

	public void _initPageObjects() throws Exception {
		lnchActPageObject = new ALaunchActivityKeywords(driver);
		simpTestPageObject = new BSimpleTestActivityKeywords(driver);
/*		actualResult="";
		expectedResult="";
		actualBooleanResult=true;
		expectedBooleanResult = true;*/
	}

	public void launchBrowser() throws Exception {
		driver = new FirefoxDriver();
		_initPageObjects();
	}

	public void launchUrl() throws Exception {
		driver.get("http://cxp.cengage.com/activityservice/test");
	}
}