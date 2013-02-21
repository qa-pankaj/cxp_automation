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
	expectedResult = "Activity Service Test Page";
	actualResult = simpTestPageObject.verifySimpleTestContentPageHeader();
	Assert.assertTrue(actualResult.contentEquals(expectedResult));
	}
	
	@Test (dependsOnMethods = {"verifySimpleTestContentPageHeader"})
	public void verifyShowScoresButtonIsActive() throws Exception {
		actualBooleanResult=simpTestPageObject.verifyShowScoresButtonIsActive();
		Assert.assertTrue(actualBooleanResult);
	}
	
	@Test (dependsOnMethods = {"verifyShowScoresButtonIsActive"})
	public void verifyReviewButtonIsActive() throws Exception {
		actualBooleanResult=simpTestPageObject.verifyReviewButtonIsActive();
		Assert.assertTrue(actualBooleanResult);
	}
	
	@Test (dependsOnMethods = {"verifyReviewButtonIsActive"})
	public void verifyNewTestButtonIsActive() throws Exception {
		actualBooleanResult=simpTestPageObject.verifyNewTestButtonIsActive();
		Assert.assertTrue(actualBooleanResult);
	}
	
	
	@Test (dependsOnMethods={"verifyNewTestButtonIsActive"})
	public void verifyMultipleChoiceItemIsLoaded() throws Exception {
		expectedResult = "2^3 is";
		actualResult = simpTestPageObject.verifyFirstItemIsLoaded();
		Assert.assertTrue(actualResult.startsWith(expectedResult));
	}
	@Test (dependsOnMethods={"verifyMultipleChoiceItemIsLoaded"})
	public void verifyReviewTopicButtonIsEnabled () throws Exception{	
		actualBooleanResult=simpTestPageObject.verifyReviewTopicButtonIsEnabled();
		expectedBooleanResult=true;
		Assert.assertTrue(actualBooleanResult.equals(expectedBooleanResult));
	}
	@Test (dependsOnMethods={"verifyReviewTopicButtonIsEnabled"})
	public void verifyClickingOnReviewTopicButtonShowsReviewTopics () throws Exception {
		actualBooleanResult=simpTestPageObject.verifyClickingOnReviewTopicButtonShowsReviewTopics();
		expectedBooleanResult=true;
		Assert.assertTrue(actualBooleanResult.equals(expectedBooleanResult));		
	}	
	@Test (dependsOnMethods={"verifyClickingOnReviewTopicButtonShowsReviewTopics"})
	public void verifyClickingOnReviewTopicShowsReviewTopicPage () throws Exception{	
		expectedResult = "Hello, I'm a Narrative!";
		actualResult = simpTestPageObject.verifyClickingOnReviewTopicShowsReviewTopicPage();
		Assert.assertTrue(actualResult.equals(expectedResult));	
	}
	
	@Test (dependsOnMethods={"verifyClickingOnReviewTopicShowsReviewTopicPage"})
	public void verifyCloseReviewTopics () throws Exception{	
		actualBooleanResult=simpTestPageObject.verifyCloseReviewTopics();
		expectedBooleanResult=true;
		Assert.assertTrue(actualBooleanResult.equals(expectedBooleanResult));
	}
	@Test (dependsOnMethods={"verifyCloseReviewTopics"})
	public void verifyShowHintButtonIsEnabled () throws Exception{	
		actualBooleanResult=simpTestPageObject.verifyShowHintButtonIsEnabled();
		expectedBooleanResult=true;
		Assert.assertTrue(actualBooleanResult.equals(expectedBooleanResult));
	}
	
	@Test (dependsOnMethods={"verifyShowHintButtonIsEnabled"})
	public void verifyClickingOnShowHintButtonShowsHint () throws Exception {
		expectedResult = "Sample hint";
		actualResult = simpTestPageObject.verifyClickingOnShowHintButtonShowsHint();
		Assert.assertTrue(actualResult.contains(expectedResult));	
	}	
	@Test (dependsOnMethods={"verifyClickingOnShowHintButtonShowsHint"})
	public void verifyShowHintIsChangedToHideHint () throws Exception{
		expectedResult = "Hide Hint";
		actualResult = simpTestPageObject.verifyShowHintIsChangedToHideHint();
		Assert.assertTrue(actualResult.equals(expectedResult));
	}
	
	@Test (dependsOnMethods={"verifyShowHintIsChangedToHideHint"})
	public void verifyClickingOnHideHintClosesHint () throws Exception{
		actualBooleanResult=simpTestPageObject.verifyClickingOnHideHintClosesHint();
		expectedBooleanResult=false;
		Assert.assertFalse(actualBooleanResult.equals(expectedBooleanResult));
	}
	@Test (dependsOnMethods={"verifyClickingOnHideHintClosesHint"})
	public void verifyReferencesButtonIsEnabled () throws Exception{	
		expectedBooleanResult=true;
		actualBooleanResult=simpTestPageObject.verifyReferencesButtonIsEnabled();
		Assert.assertTrue(actualBooleanResult.equals(expectedBooleanResult));
	}
	@Test (dependsOnMethods={"verifyReferencesButtonIsEnabled"})
	public void verifyClickOnReferencesButtonShowsReferencesList () throws Exception {	
		String referenceItems = "Scientific Notation;Periodic Table;Tables";
		expectedBooleanResult = true;
		actualBooleanResult = simpTestPageObject.verifyClickOnReferencesButtonShowsReferencesList(referenceItems);
		Assert.assertTrue(actualBooleanResult.equals(expectedBooleanResult));
	}	
	
	@Test(dependsOnMethods={"verifyClickOnReferencesButtonShowsReferencesList"})
	public void verifyClickingOnReferencesShowsReferencesPage () throws Exception{
		String referenceItems = "Scientific Notation;Periodic Table;Tables";
		expectedBooleanResult = true;
		actualBooleanResult = simpTestPageObject.verifyClickingOnReferencesShowsReferencesPage(referenceItems);
		Assert.assertTrue(actualBooleanResult.equals(expectedBooleanResult));		
	}
		
	@Test(dependsOnMethods={"verifyClickingOnReferencesShowsReferencesPage"})
	public void verifySubmitAnswerButtonOnMultipleChoiceItemBeforeSubmitIsActive() throws Exception {
		expectedBooleanResult = true;
		actualBooleanResult = simpTestPageObject.verifySubmitAnswerButtonOnMultipleChoiceItemBeforeSubmitIsActive();
		Assert.assertTrue(actualBooleanResult.equals(expectedBooleanResult));		
	}
	
	@Test (dependsOnMethods={"verifySubmitAnswerButtonOnMultipleChoiceItemBeforeSubmitIsActive"})
	public void verifyTryAnotherButtonOnMultipleChoiceItemBeforeSubmitIsInactive() throws Exception {
		expectedBooleanResult = true;
		actualBooleanResult = simpTestPageObject.verifyTryAnotherButtonOnMultipleChoiceItemBeforeSubmitIsInactive();
		Assert.assertTrue(actualBooleanResult.equals(expectedBooleanResult));	
	}
	
	@Test (dependsOnMethods={"verifyTryAnotherButtonOnMultipleChoiceItemBeforeSubmitIsInactive"})
	public void verifyNextLinkOnMultipleChoiceFirstItemIsActive () throws Exception{
		expectedBooleanResult = true;
		actualBooleanResult = simpTestPageObject.verifyNextLinkOnMultipleChoiceFirstItemIsActive();
		Assert.assertTrue(actualBooleanResult.equals(expectedBooleanResult));	
	}
	
	@Test (dependsOnMethods={"verifyNextLinkOnMultipleChoiceFirstItemIsActive"})
	public void verifyPrevLinkOnMultipleChoiceFirstItemIsNotPresent () throws Exception{
		actualBooleanResult = simpTestPageObject.verifyPrevLinkOnMultipleChoiceFirstItemIsNotPresent();
		Assert.assertTrue(actualBooleanResult);	
	}
	
	@Test (dependsOnMethods={"verifyPrevLinkOnMultipleChoiceFirstItemIsNotPresent"})
	public void verifySubmittingIncorrectAnswerForMultipleChoiceShowsIncorrectRejoinder() throws Exception {
		actualBooleanResult = simpTestPageObject.verifySubmittingIncorrectAnswerForMultipleChoiceShowsIncorrectRejoinder();
		Assert.assertTrue(actualBooleanResult);			
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
