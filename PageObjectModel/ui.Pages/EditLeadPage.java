package leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseclass.BaseClass;

public class EditLeadPage extends BaseClass {
	
	public EditLeadPage(RemoteWebDriver driver)
	{
		this.driver=driver;
	}

	public EditLeadPage editCompanyName(String compName)
	{
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(compName);
		return this;
	}
	
	public ViewLeadsPage clickUpdateButton()
	{
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadsPage(driver);
		
	}
	
	
}
