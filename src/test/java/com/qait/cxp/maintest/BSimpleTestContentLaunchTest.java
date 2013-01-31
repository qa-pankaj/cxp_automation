package com.qait.cxp.maintest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.qait.cxp.dsl.BaseDSLLib;

public class BSimpleTestContentLaunchTest extends BaseDSLLib {
	
	@Test
	public void verifySimpleTestContentPageHeader () throws Exception {
		System.out.println("Page2 callTest1");
		simpTestPageObject.verifySimpleTestContentPageHeader();
	}
	
	@Test
	public void verify_that_the_Take_Assignment_header_is_present(){
		simpTestPageObject.getScoreButtonTextAndClick();
	}
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}
}
