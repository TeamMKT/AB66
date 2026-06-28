package testNG_Browsers;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import testNG_MKT.ListnerLogic;

public class ListnerLogic1 implements ITestListener
{
	public static WebDriver driver;
	
	public void onTestSuccess(ITestResult result)
	{
		ITestListener.super.onTestSuccess(result);
		Date d1 = new Date();
		long l1 = d1.getTime();
		System.out.println(l1);
		
		Date d2 = new Date(d1.getTime());
		System.out.println(d2);
		
		String format1  = d2.toString();
		 String format2 = format1.replace(":" , "");
		 System.out.println(format2);
		 
		 TakesScreenshot ts= (TakesScreenshot) driver;
		 File source = ts.getScreenshotAs(OutputType.FILE);
		 //File destination = new File("C:\\Users\\geeta\\eclipse-workspace\\FirstProject\\test-output\\ScreenShot\\pass\\"+new String()+format2 +".png");
		 File destination = new File("C:\\Users\\geeta\\eclipse-workspace\\FirstProject\\test-output\\ScreenShot\\pass\\"+new ListnerLogic1().getClass()+format2+".png");
		 try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		ITestListener.super.onTestFailure(result);
		Date d1 = new Date();
		long l1 = d1.getTime();
		System.out.println(l1);
		
		Date d2 = new Date(d1.getTime());
		System.out.println(d2);
		
		String format1  = d2.toString();
		 String format = format1.replace(":" , "");
		 System.out.println(format);
		 TakesScreenshot ts= (TakesScreenshot) driver;
		 File source = ts.getScreenshotAs(OutputType.FILE);

	 File destination = new File("C:\\Users\\geeta\\eclipse-workspace\\FirstProject\\test-output\\ScreenShot\\fail\\"+new ListnerLogic1().getClass()+format+".png");
		 try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
