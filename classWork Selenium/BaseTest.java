package com.testng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	ChromeDriver driver;
	@BeforeMethod
	public void lunchBrowser() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	@AfterMethod
	public void quitBrowser()
	{
		driver.quit();
	}

}
