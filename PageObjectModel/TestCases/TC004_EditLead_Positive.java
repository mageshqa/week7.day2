package testcases;

import org.testng.annotations.Test;

import baseclass.BaseClass;
import baseclass.RetryFailedCase;
import leaftaps.ui.pages.LoginPage;

public class TC004_EditLead_Positive extends BaseClass{
	
	@Test(dataProvider = "EditLeadDataProvider",
			retryAnalyzer = RetryFailedCase.class)
	public void runTC004(String username, String password, String phnNum, String compName) throws InterruptedException
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
		.clickEditButton()
		.editCompanyName(compName)
		.clickUpdateButton()
		.verifyLeadID();
		
		
	}

}
