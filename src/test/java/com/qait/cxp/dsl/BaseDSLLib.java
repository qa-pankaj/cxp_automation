package com.qait.cxp.dsl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.qait.cxp.keywords.ALaunchActivityKeywords;
import com.qait.cxp.pageobjects.ALaunchActivityPage;
import com.qait.cxp.pageobjects.BSimpleTestContentLaunchPage;

public class BaseDSLLib {

	protected static WebDriver driver;
	protected static ALaunchActivityKeywords lnchActPageObject;
	protected static BSimpleTestContentLaunchPage simpTestPageObject;

	public void _initPageObjects() throws Exception {
		lnchActPageObject = new ALaunchActivityKeywords(driver);
		simpTestPageObject = new BSimpleTestContentLaunchPage(driver);
	}

	public void launchBrowser() throws Exception {
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
capabilities.setJavascriptEnabled(true);
 driver = new ChromeDriver(capabilities);
		_initPageObjects();
	}

	public void launchUrl() throws Exception {
		driver.get("http://s-cxp.cengage.com/activityservice/test");
	}
}
