package flipkart;


import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import ExcelData.ExcelData;
import POM.HomePage;

@Listeners(lisners.lisnerClass.class)
public class test1 extends BaseClass {
	
	HomePage home;
	@Test(priority = 0)
	public void test2() throws InterruptedException {
		
	home=new HomePage(driver);
	Actions Act =new Actions(driver);
	Act.moveToElement(home.garments()).perform();
	Act.release();
	}
	
	@Test(priority = 2)
	public void test3() throws InterruptedException {
		
	HomePage home=new HomePage(driver);
	Thread.sleep(2000);
	Actions Act =new Actions(driver);
	Act.moveToElement(home.LoginButton()).perform();
	home.LoginButton().click();
	
    }	
	
//	@Test
//	public void test4() throws Exception {
//		
//		home=new HomePage(driver);
//		String Sheet = "Sheet1";
//		int length=3;
//		int j=0;
//		for (int i = 0; i < length; i++) {
//			j++;
//			String product = ExcelData.inputData(Sheet, 0, j);
//			home.Searchbox().sendKeys(product);
//			Thread.sleep(3000);
//			home.Searchbox().clear();
//		}
//		
//	}
	

}
