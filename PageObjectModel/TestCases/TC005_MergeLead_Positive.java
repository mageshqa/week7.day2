package testcases;

import org.testng.annotations.Test;

import baseclass.BaseClass;
import baseclass.RetryFailedCase;
import leaftaps.ui.pages.LoginPage;

public class TC005_MergeLead_Positive extends BaseClass{
	
	@Test(dataProvider = "MergeLeadDataProvider",
			retryAnalyzer = RetryFailedCase.class)
	public void runTC005(String username, String password, String firstName, String nxtName) throws InterruptedException
	{
		
		new LoginPage(driver)
		.enterUserName(username)
		.enterPassWord(password)
		.clickLogonButton_Positive()
		.clickCRMSFA()
		.clickLeads()
		.clickMergeLeads()
		.clickLookUp1AndGoToNewindow()
		.searchFirstName(firstName)
		.clickFindLeadsButton_LookUP()
		.findLeadID_LookUp()
		.selectLeadFrmLookUpMoveToMergeLeadPage()
		.clickLookUp2AndGotoNewindow()
		.searchNextName(nxtName)
		.clickFindLeadsButton_LookUP()
		.selectLeadFrmLookUpMoveToMergeLeadPage()
		.clickMergeButton()
		.acceptAlert()
		.clickFindLeads()
		.findLeadID()
		.clickFindLeadsButton()
		.verifyMergedLead();
		
		
	}
	

}
