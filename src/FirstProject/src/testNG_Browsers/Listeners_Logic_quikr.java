package testNG_Browsers;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners_Logic_quikr  implements ITestListener
{
	
	public static WebDriver driver;
	public void onTestSuccess(ITestResult result) {
		ITestListener.super.onTestSuccess(result);
		 TakesScreenshot ts= (TakesScreenshot) driver;
		 File source = ts.getScreenshotAs(OutputType.FILE);
		 File destination = new File("C:\\Users\\geeta\\eclipse-workspace\\FirstProject\\test-output\\ScreenShot\\pass\\testscenario1.png");
		 try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		ITestListener.super.onTestFailure(result);
		TakesScreenshot ts= (TakesScreenshot) driver;
		 File source = ts.getScreenshotAs(OutputType.FILE);
		 File destination = new File("C:\\Users\\geeta\\eclipse-workspace\\FirstProject\\test-output\\ScreenShot\\fail\\testscenario2.png");
		 try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
  
}
