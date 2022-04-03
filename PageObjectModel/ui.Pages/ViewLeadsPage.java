package leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseclass.BaseClass;

public class ViewLeadsPage extends BaseClass {

	public ViewLeadsPage(RemoteWebDriver driver) {
		this.driver=driver;
	}

	public ViewLeadsPage verifyLeadID() {
		String leadID = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(leadID);
		return this;
	}
	
	public LeadsPage deleteLead()
	{
		driver.findElement(By.linkText("Delete")).click();
		return new LeadsPage(driver);
	}
	
	public DuplicateLeadPage clickDuplicateLead()
	{
		driver.findElement(By.linkText("Duplicate Lead")).click();
		return new DuplicateLeadPage(driver);
	}

	public EditLeadPage clickEditButton()
	{
		driver.findElement(By.linkText("Edit")).click();
		return new EditLeadPage(driver);
	}
	
	public FindLeadsPage clickFindLeads()
	{
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLeadsPage(driver);
	}
	
}
