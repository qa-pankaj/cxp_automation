package com.qait.cxp.maintest;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qait.cxp.dsl.BaseDSLLib;

public class BSimpleTestContentLaunchTest extends BaseDSLLib {

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	
	@Test (dependsOnGroups = "To_Go_To_Next_Page")
	public void verifySimpleTestContentPageHeader() throws Exception {
	String expectedResult = "Activity Service Test Page";
	String actualResult = simpTestPageObject.verifySimpleTestContentPageHeader();
	Assert.assertTrue(actualResult.contentEquals(expectedResult));
	}
	@Test (dependsOnMethods={"verifySimpleTestContentPageHeader"})
	public void verifyMultipleChoiceItemIsLoaded() throws Exception {
		String actualResult;
		String expectedResult = "2^3 is";
		actualResult = simpTestPageObject.verifyFirstItemIsLoaded();
		Assert.assertTrue(actualResult.startsWith(expectedResult));
	}
	@Test (dependsOnMethods={"verifyMultipleChoiceItemIsLoaded"})
	public void verifyReviewTopicButtonIsEnabled () throws Exception{	
		Boolean actualBooleanResult=simpTestPageObject.verifyReviewTopicButtonIsEnabled();
		Boolean expectedBooleanResult=true;
		Assert.assertTrue(actualBooleanResult.equals(expectedBooleanResult));
	}
	@Test
	public void verifyClickOnReviewTopicButton () throws Exception {		
	}	
	@Test
	public void verifyReviewTopicsAppear () throws Exception{	
	}
	@Test
	public void verifyClickingOnReviewTopicShowsReviewTopicPage () throws Exception{	
	}
	@Test
	public void verifyCloseReviewTopics () throws Exception{	
	}
	@Test
	public void verifyShowHintButtonIsEnabled () throws Exception{	
	}
	@Test
	public void verifyClickingOnShowHintButtonShowsHint () throws Exception {		
	}	
	@Test
	public void verifyClickOnHideHint () throws Exception{	
	}
	public void verifyReferencesButtonIsEnabled () throws Exception{	
	}
	@Test
	public void verifyClickOnReferencesButtonShowsReferencesList () throws Exception {		
	}	
	@Test
	public void verifyClickingOnReferencesShowsReferencesPage () throws Exception{	
	}
	@Test
	public void verifyClosingReferencesPage () throws Exception{	
	}	
	@Test
	public void verifySubmitAnswerButtonOnMultipleChoiceItemBeforeSubmitIsActive() throws Exception {
	}
	@Test
	public void verifyTryAnotherButtonOnMultipleChoiceItemBeforeSubmitIsInactive() throws Exception {
	}
	@Test
	public void verifyNextLinkOnMultipleChoiceItemBeforeSubmitIsActive () throws Exception{
	}
	@Test
	public void verifySubmittingIncorrectAnswerForMultipleChoiceShowsIncorrectRejoinder() throws Exception {
	}	
	@Test
	public void verifyTryAnotherVersionButtonOnMultipleChoiceItemAfterSubmitIsActive() throws Exception {
	}
	@Test
	public void verifySubmitAnswerButtonOnMultipleChoiceItemAfterSubmitIsInactive() throws Exception {
	}	
	@Test
	public void verifyClickingOnTryAnotherVersionReloadsMultipleChoiceItem() throws Exception {
	}
	@Test
	public void verifyTryAnotherButtonOnMultipleChoiceItemAfterSubmitAndReloadIsInactive() throws Exception {
	}
	@Test
	public void verifySubmitAnswerButtonOnMultipleChoiceAfterSubmitAndReloadIsActive() throws Exception {
	}
	@Test
	public void verifySubmittingCorrectAnswerForMultipleChoiceShowsShowsCorrectRejoinder() throws Exception {
	}	
	@Test
	public void verifySubmitAnswerButtonOnMultipleChoiceItemAfterSubmitReloadAndSubmitIsInactive() throws Exception {
	}	
	@Test
	public void verifyNextLinkOnMultipleChoiceItemAfterSubmitIsActive () throws Exception{
	}		
	@Test
	public void verifyClikingOnNextLinkLoadsNextFITBItem () throws Exception{
	}		
	public void verifySubmittingIncorrectAnswerForFITBShowsIncorrectRejoinder1() throws Exception {
	}	
	@Test
	public void verifyTryAnotherVersionButtonOnFITBItemAfterSubmitIsActive() throws Exception {
	}
	@Test
	public void verifySubmitAnswerButtonOnFITBItemAfterSubmitIsInactive() throws Exception {
	}	
	@Test
	public void verifyClickingOnTryAnotherVersionReloadsFITBItem() throws Exception {
	}
	@Test
	public void verifyTryAnotherButtonOnFITBItemAfterSubmitAndReloadIsInactive() throws Exception {
	}
	@Test
	public void verifySubmitAnswerButtonOnFITBItemAfterSubmitAndReloadIsActive() throws Exception {
	}
	@Test
	public void verifySubmittingCorrectAnswerForFITBShowsCorrectRejoinder() throws Exception {
	}	
	@Test
	public void verifySubmitAnswerButtonOnFITBItemAfterSubmitReloadAndSubmitIsInactive() throws Exception {
	}
	@Test
	public void verifyTryAnotherVersionButtonOnFITBItemAfterSubmitReloadAndSubmitIsActive() throws Exception {
	}
	@Test
	public void verifyNextLinkOnFITBItemAfterSubmitIsActive () throws Exception{
	}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * @Test public void verify_that_the_Take_Assignment_header_is_present(){
	 * simpTestPageObject.getScoreButtonTextAndClick(); }
	 */

}
