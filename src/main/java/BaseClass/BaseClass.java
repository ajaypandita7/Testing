package BaseClass;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;

import utilClass.utilClass;

public class BaseClass {

	public WebDriver driver;
	@BeforeClass
	public void beforeClass() {
	
	}
	@BeforeMethod
	public void beforeMethod() throws Exception {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		String url = utilClass.util("url");
		driver.get(url);
		System.out.println("Hello Ajayyyyy");
	}
	
	@BeforeTest
	public void beforeTest() {
		
	}
	
	@AfterTest
	public void afterTest() {
		
	}
	@AfterMethod
	public void afterMethod() throws Exception {
		 driver.quit();
	}
	@AfterClass
	public void afterClass() {
		
	  
	}
}
