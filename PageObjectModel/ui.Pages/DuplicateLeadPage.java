package leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseclass.BaseClass;

public class DuplicateLeadPage extends BaseClass{
	
	public DuplicateLeadPage(RemoteWebDriver driver)
	{
		this.driver=driver;
	}
	
	public ViewLeadsPage clickDuplicateLeadButton()
	{
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadsPage(driver);
	}

}
