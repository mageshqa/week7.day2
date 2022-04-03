package leaftaps.ui.pages;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseclass.BaseClass;

public class FindLeadsLookUpPage extends BaseClass{
	
	public FindLeadsLookUpPage(RemoteWebDriver driver)
	{
		this.driver=driver;
	}
	
	public FindLeadsLookUpPage searchFirstName(String firstName)
	{
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(firstName);
		return this;
	}
	
	public FindLeadsLookUpPage searchNextName(String nxtName)
	{
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(nxtName);
		return this;
	}

	public FindLeadsLookUpPage clickFindLeadsButton_LookUP() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		return this;
	}
	
	public FindLeadsLookUpPage findLeadID_LookUp()
	{
		leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"))
				.getText();
		System.out.println(leadID);
		return this;
	}
	
	public MergeLeadsPage selectLeadFrmLookUpMoveToMergeLeadPage()
	{
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(0));
		return new MergeLeadsPage(driver);
	}
	
	/*
	 * public MergeLeadsPage shiftToMergeLeadsPage() { Set<String> allWindows =
	 * driver.getWindowHandles(); List<String> allhandles = new
	 * ArrayList<String>(allWindows); driver.switchTo().window(allhandles.get(0));
	 * return new MergeLeadsPage(driver); }
	 */
	
	
	
}
