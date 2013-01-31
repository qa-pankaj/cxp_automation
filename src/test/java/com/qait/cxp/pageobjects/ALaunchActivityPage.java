package com.qait.cxp.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ALaunchActivityPage extends AbstractPage {

	public ALaunchActivityPage(WebDriver driver) {
		super(driver);
		System.out.println("Object Initialized");
	}

	@FindBy(tagName = "h1")
	protected WebElement pageHeading;

	@FindBy(name = "xml")
	protected WebElement activityXmlTextArea;

	@FindBy(css = "select.presets")
	protected WebElement presetsDropDown;

	@FindBy(css="div.submit input")
	protected WebElement takeactivityButton;
}