package testcases;

import org.testng.annotations.Test;

import baseclass.BaseClass;
import baseclass.RetryFailedCase;
import leaftaps.ui.pages.LoginPage;

public class TC002_DeleteLead_Positive extends BaseClass {

	@Test(dataProvider = "DeleteLeadDataProvider",
			retryAnalyzer = RetryFailedCase.class)
	public void runTC002(String userName, String password, String phnNum) throws InterruptedException {

		new LoginPage(driver)
		.enterUserName(userName)
		.enterPassWord(password)
		.clickLogonButton_Positive()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads()
		.searchByPhoneNumber(phnNum)
		.clickFindLeadsButton()
		.getLeadID()
		.selectLead()
		.deleteLead()
		.clickFindLeads()
		.findLeadID()
		.verifyDeletedLead();

	}

}
