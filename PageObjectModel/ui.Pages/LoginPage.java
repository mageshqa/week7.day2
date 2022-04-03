package leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseclass.BaseClass;

public class LoginPage extends BaseClass{
	
	public LoginPage(RemoteWebDriver driver)
	{
		this.driver=driver;
	}
	
	public LoginPage enterUserName(String userName)
	{
		driver.findElement(By.id("username")).sendKeys(userName);
		return this;
		
	}
	
	public LoginPage enterPassWord(String password)
	{
		driver.findElement(By.id("password")).sendKeys(password);
		return this;
	}
	
	public WelcomePage clickLogonButton_Positive()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage(driver);
	}
	
	public LoginPage clickLogonButton_Negative()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
		return this;
	}
	

}
