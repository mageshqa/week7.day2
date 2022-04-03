package leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseclass.BaseClass;

public class FindLeadsPage extends BaseClass{
	
	
	public FindLeadsPage(RemoteWebDriver driver)
	{
		this.driver=driver;
	}
	
	public FindLeadsPage searchByPhoneNumber(String phnNum)
	{
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phnNum);
		return this;
	}
	
	public FindLeadsPage clickFindLeadsButton() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		return this;
	}
	
	public FindLeadsPage getLeadID()
	{
		leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"))
				.getText();
		System.out.println(leadID);
		return this;
		
	}
	
	public ViewLeadsPage selectLead()
	{
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return new ViewLeadsPage(driver);
	}
	
	public FindLeadsPage findLeadID()
	{
		System.out.println(leadID);
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		return this;
	}
	
	public FindLeadsPage verifyDeletedLead()
	{
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
		return this;
	}
	
	public FindLeadsPage verifyMergedLead()
	{
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
		return this;
	}
	
	

}
