package annotations;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners_Logic implements ITestListener
{

	public static WebDriver driver;
	public void onTestSuccess(ITestResult result) 
	{
		ITestListener.super.onTestSuccess(result);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		File destiation = new File("C:\\Users\\geeta\\eclipse-workspace\\FirstProject\\test-output\\ScreenShot\\pass\\amazonpass.png");
		try {
			FileHandler.copy(Source, destiation);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void onTestFailure(ITestResult result) 
	{
		ITestListener.super.onTestFailure(result);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		File destiation = new File("C:\\Users\\geeta\\eclipse-workspace\\FirstProject\\test-output\\ScreenShot\\fail\\amazonfail.png");
		try {
			FileHandler.copy(Source, destiation);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
  
}
