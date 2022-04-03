package leaftaps.ui.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseclass.BaseClass;

public class MergeLeadsPage extends BaseClass{
	
	public MergeLeadsPage(RemoteWebDriver driver)
	{
		this.driver=driver;
	}
	
	public FindLeadsLookUpPage clickLookUp1AndGoToNewindow()
	{
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		return new FindLeadsLookUpPage(driver);
		
	}
	/*
	 * public FindLeadsLookUpPage shiftToLookUpWindow() { Set<String> allWindows =
	 * driver.getWindowHandles(); List<String> allhandles = new
	 * ArrayList<String>(allWindows); driver.switchTo().window(allhandles.get(1));
	 * return new FindLeadsLookUpPage(driver); }
	 */
	
	public FindLeadsLookUpPage clickLookUp2AndGotoNewindow()
	{
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		return new FindLeadsLookUpPage(driver);
	}

	public MergeLeadsPage clickMergeButton()
	{
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		return this;
	}
	
	public ViewLeadsPage acceptAlert()
	{
		driver.switchTo().alert().accept();
		return new ViewLeadsPage(driver);
	}
	
	
	
}
