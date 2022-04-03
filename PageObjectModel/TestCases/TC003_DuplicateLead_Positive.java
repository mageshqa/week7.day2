package testcases;

import org.testng.annotations.Test;

import baseclass.BaseClass;
import baseclass.RetryFailedCase;
import leaftaps.ui.pages.LoginPage;

public class TC003_DuplicateLead_Positive extends BaseClass{
	
	@Test(dataProvider = "DuplicateLeadDataProvider",
			retryAnalyzer = RetryFailedCase.class)
	public void runTC003(String username, String password, String phnNum) throws InterruptedException
	{
		new LoginPage(driver)
		.enterUserName(username)
		.enterPassWord(password)
		.clickLogonButton_Positive()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads()
		.searchByPhoneNumber(phnNum)
		.clickFindLeadsButton()
		.selectLead()
		.clickDuplicateLead()
		.clickDuplicateLeadButton()
		.verifyLeadID();
		
		
	}

}
