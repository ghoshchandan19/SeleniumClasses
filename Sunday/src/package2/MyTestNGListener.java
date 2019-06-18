package package2;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class MyTestNGListener implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log(result.getName()+"Script execution Start",true);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log(result.getName()+"Script is Passed",true);
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log(result.getName()+"Script got Failed", true);
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log(result.getName()+"Script got skipped", true);
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("Suite Execution Started", true);
		
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("Suit Execution Finished", true);
		
	}

}
