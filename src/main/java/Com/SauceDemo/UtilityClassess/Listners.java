package Com.SauceDemo.UtilityClassess;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners implements ITestListener

{

	public void onTestStart(ITestResult result)
	{
		System.out.println("Test is Started");
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("test case is sucessfull passed");
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("test case is failed and taking screenshot");
	}
	public void onFinish(ITestResult result)
	{
		System.out.println("test case is finished");
	}
}
