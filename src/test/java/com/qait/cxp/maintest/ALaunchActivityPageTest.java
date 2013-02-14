package com.qait.cxp.maintest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

//import com.qait.cxp.dataprovider.CxpDataProvider;
import com.qait.cxp.dataprovider.CxpDataProvider;
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

	
	public String fetch_Xml_To_Load() throws Exception {
		CxpDataProvider dataProviderObject = new CxpDataProvider();
		String itemXml=dataProviderObject.getXmlFromFile("roundSF.txt");
		return itemXml;
	}
	@Test (dependsOnMethods={"verifyActivityPageHeader"})
	public void verify_Select_Xml_and_Load() throws Exception {
		lnchActPageObject.verifySelectXmlandLoad(fetch_Xml_To_Load());
	}
/*	@Test
	public void verify_Select_Xml_and_Load() throws Exception {
		lnchActPageObject.verifySelectXmlandLoad();
	}*/
	
	@Test (dependsOnMethods={"verify_Select_Xml_and_Load"})
	public void verify_Take_Assignment() throws Exception{
		lnchActPageObject.clickTakeActivity();}

}
