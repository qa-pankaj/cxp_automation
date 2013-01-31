package com.qait.cxp.pageobjects;

import javax.swing.text.StyledEditorKit.BoldAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractPage {

	WebDriver driver;
	int waitTimeInSec = 30;
	WebDriverWait wait;

	public AbstractPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(
				new AjaxElementLocatorFactory(this.driver, 30), this);
		wait = new WebDriverWait(driver, waitTimeInSec * 1000);

	}

	protected boolean waitForElementToBeVisible(WebElement element) {
		try {
			for (int i = 0; i < waitTimeInSec; i++) {
				Thread.sleep(1000);
				if (element.isDisplayed()) {
					return true;
				}
			}
			return false;
		} catch (InterruptedException e) {
			e.printStackTrace();
			return false;
		}
	}

	protected void waitForElementToBeVisible(By locator) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	protected void waitForElementToBeClickable(By locator) {
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

}
