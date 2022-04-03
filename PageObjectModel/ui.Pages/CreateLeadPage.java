package leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseclass.BaseClass;

public class CreateLeadPage extends BaseClass{
	
	public CreateLeadPage(RemoteWebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public CreateLeadPage enterCompanyName(String compName)
	{
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(compName);
		return this;
	}
	
	public CreateLeadPage enterFirstName(String firstName)
	{
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		return this;
	}
	
	public CreateLeadPage enterLastName(String lastName)
	{
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		return this;
	}
	
	public ViewLeadsPage clickSubmitButton()
	{
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadsPage(driver);
	}

}
