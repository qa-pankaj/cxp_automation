package com.qait.cxp.pageobjects;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

import javax.swing.text.StyledEditorKit.BoldAction;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import com.qait.cxp.dataprovider.testdata.samples.*;
public abstract class AbstractPage {

	protected WebDriver driver;
	int waitTimeInSec = 30;
	WebDriverWait wait;

	public AbstractPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(
				new AjaxElementLocatorFactory(this.driver, 15), this);
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

	protected boolean waitForTextToBeVisible(WebElement element, String text) {
		try {
			for (int i = 0; i < waitTimeInSec; i++) {
				Thread.sleep(1000);
				if (element.getAttribute("value").endsWith(text)) {
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
	
	protected Boolean assertElementNotPresent(String text) {
	    try {
	        driver.findElement(By.cssSelector(text));
	        System.out.println("Element with css <" + text + "> is present");
	        return false;
	    } catch (NoSuchElementException ex) {
	    	return true;
	        /* do nothing, link is not present, assert is passed */ 
	    }
	}
	/*protected String getXmlFromFile(String fileName) throws Exception{
		URL fileURL = AbstractPage.class.getResource(fileName);
		System.out.println(fileURL.getFile());
		BufferedReader br = null;
		String itemXml = "";		 
		try {
			String sCurrentLine;

			FileReader fl = new FileReader(new File(fileURL.getFile()));
			br = new BufferedReader(fl);
			
			//br = new BufferedReader(new FileReader("C:\testing.txt"));
 
			while ((sCurrentLine = br.readLine()) != null) {
				itemXml=itemXml+sCurrentLine+"\n";
				
			}
			 System.out.println(itemXml);
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}

		}
		return itemXml;
	}*/
}