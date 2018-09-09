package com.accenture.utilities;

import static org.testng.Assert.fail;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class MyListener implements ITestListener {
	
	ExtentReports e;
	ExtentTest t;

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		//System.out.println("On Test Start");
		t=e.startTest(result.getMethod().getMethodName(),"Has Started");
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		//System.out.println("On Test Pass");
		t.log(LogStatus.PASS, result.getMethod().getMethodName(),"Has Passed");
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		//System.out.println("On Test Fail");
		t.log(LogStatus.FAIL, result.getMethod().getMethodName(),"Has Failed");
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("On Test Skipped");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("On TestNG Start");
		e = new ExtentReports("C:\\Users\\pdc2b-training.pdc2b\\eclipse-workspace\\com.pomframework\\test-output\\MyReport.html");
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		///System.out.println("On TestNG Finish");
		e.endTest(t);
		e.flush();
		
	}

}
