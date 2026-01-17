package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("Test Started: " +result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Pass: " +result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Fail: " +result.getName());
		
		Screenshots.getScreenShot(result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("Skipped: " +result.getName());
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		System.out.println("Test Starts");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		System.out.println("Test Ends");
		
	}
	
	
	
	
	
	

}
