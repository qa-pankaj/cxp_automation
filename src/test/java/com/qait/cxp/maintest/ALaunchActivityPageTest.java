package com.qait.cxp.maintest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.qait.cxp.dsl.*;
public class ALaunchActivityPageTest extends BaseDSLLib {

	@BeforeClass
	public void startBrowser() throws Exception {
		launchBrowser();
		launchUrl();
	}

	@Test
	public void verifyActivityPageHeader() throws Exception {
		System.out.println("callTest 1");
		lnchActPageObject.verifyActivityPageHeader();
	}

	@Test
	public void verify_Select_Xml_and_Load() throws Exception {
		lnchActPageObject.verifySelectXmlandLoad();
	}
	
	@Test
	public void verify_Take_Assignment() throws Exception{
		lnchActPageObject.clickTakeActivity();}

}
