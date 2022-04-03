package leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseclass.BaseClass;

public class HomePage extends BaseClass{
	
	public HomePage(RemoteWebDriver driver)
	{
		this.driver=driver;
	}
	
	public LeadsPage clickLeads()
	{
		driver.findElement(By.linkText("Leads")).click();
		return new LeadsPage(driver);
	}

}
