package HotelBooking;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resources.ExtentReporter;
import resources.ExtentReporter;
import resources.base;

public class Listeners extends base implements ITestListener{
	
	ExtentTest test;
	ExtentReports extent=ExtentReporter.getReportObject();
	ThreadLocal<ExtentTest> extentTest =new ThreadLocal<ExtentTest>();
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		test= extent.createTest(result.getMethod().getMethodName());
		extentTest.set(test);
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		extentTest.get().log(Status.PASS, "Test Passed");
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		extentTest.get().log(Status.FAIL, "Test Failed");
		}
		
	

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();
		
	}

}
