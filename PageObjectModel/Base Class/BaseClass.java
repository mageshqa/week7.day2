package baseclass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcel;


public class BaseClass {
	
		public RemoteWebDriver driver;
		public static String leadID;
		// public String excelFilePath;

		@Parameters({ "URL", "BROWSER" })
		@BeforeMethod
		public void beforeClass(String url, String browserName) {
			if (browserName.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}

			else if (browserName.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}

			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		}

		@AfterMethod
		public void afterMethod() {
			driver.close();
		}

		@DataProvider(name = "CreateLeadDataProvider")
		public String[][] createLeadData() throws IOException {
			String excelFilePath = "./Test Data/LeadsExercise/CreateLead.xlsx";

			String[][] data = ReadExcel.getData(excelFilePath);

			return data;
		}

		@DataProvider(name = "DeleteLeadDataProvider")
		public String[][] deleteLeadData() throws IOException {
			String excelFilePath = "./Test Data/LeadsExercise/DeleteLead.xlsx";

			String[][] data = ReadExcel.getData(excelFilePath);

			return data;
		}

		@DataProvider(name = "DuplicateLeadDataProvider")
		public String[][] duplicateLeadData() throws IOException {
			String excelFilePath = "./Test Data/LeadsExercise/DuplicateLead.xlsx";
			String[][] data = ReadExcel.getData(excelFilePath);

			return data;
		}

		@DataProvider(name = "EditLeadDataProvider")
		public String[][] editLeadData() throws IOException {
			String excelFilePath = "./Test Data/LeadsExercise/EditLead.xlsx";
			String[][] data = ReadExcel.getData(excelFilePath);

			return data;
		}

		@DataProvider(name = "MergeLeadDataProvider")
		public String[][] mergeLeadData() throws IOException {
			String excelFilePath = "./Test Data/LeadsExercise/MergeLead.xlsx";
			String[][] data = ReadExcel.getData(excelFilePath);

			return data;
		}


}
