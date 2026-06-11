package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OneFirstProgram {
// After run the testng program, we has to refresh the project then we get 'test-output' folder appear under the TestNg liabraries
// Open it and right click on emailable report.html->openWith-> Wed Browser to see the testNG report.
	
	@Test
	public void login() throws InterruptedException
	{
		 ChromeDriver driver = 	new ChromeDriver();
		   driver.get("https://www.facebook.com/login");
		   Thread.sleep(2000);
		   
		   driver.manage().window().maximize();
	// Accept cokkies   
		   driver.findElement(By.xpath("(//span[text()='Allow all cookies'])[2]")).click();
		   Thread.sleep(1000);
	// 
		   WebElement userEmail = driver.findElement(By.name("email"));
		   userEmail.sendKeys("lalith@gmail");
		   
		   WebElement userPassWord = driver.findElement(By.name("pass")); 
		   userPassWord.sendKeys("lalitha@30");
		   
		   driver.close();
		   
	}
   
   

}
