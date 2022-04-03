package testcases;

import org.testng.annotations.Test;

import baseclass.BaseClass;
import leaftaps.ui.pages.LoginPage;
import baseclass.RetryFailedCase;

public class TC001_CreateLead_Positive extends BaseClass{

	
	@Test(dataProvider = "CreateLeadDataProvider",
			retryAnalyzer = RetryFailedCase.class)
	public void runTC001(String userName, String password, String companyName, String firstName, String lastName)
	{
		
		
		new LoginPage(driver)
		.enterUserName(userName)
		.enterPassWord(password)
		.clickLogonButton_Positive()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLeadLink()
		.enterCompanyName(companyName)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.clickSubmitButton()
		.verifyLeadID();

		
		
	}
	
	
}
