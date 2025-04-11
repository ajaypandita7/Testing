package lisners;


import java.io.File;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import BaseClass.BaseClass;

public class lisnerClass extends BaseClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("testcse"+result.getName()+"started");
		System.out.println("***TestStart***");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		Reporter.log("testcse"+result.getName()+"Successfull");
		System.out.println("***onTestSuccess***");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		Random string=new Random();
		TakesScreenshot ts=(TakesScreenshot) driver;
		File old_scren = ts.getScreenshotAs(OutputType.FILE);
		File new_scren =new File("./scren-shorts/"+string+".png");
		old_scren.renameTo(new_scren);
		
		Reporter.log("tastcase"+result.getName()+"failed");
		System.out.println("***onTestFailure***");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("tastcase"+result.getName()+"Skipped");
		System.out.println("***onTestSkipped***");
	}

	@Override
	public void onStart(ITestContext context) {
		
		Reporter.log("testcase"+context.getName()+"stared",true);
		System.out.println("***onStart***");
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("testcase"+context.getName()+"finish",true);
		System.out.println("***onFinish***");
	}

	
}
