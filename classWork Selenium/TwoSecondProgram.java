package com.testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TwoSecondProgram {
/*If we want to run the two testcasess at a time ,first select classes then right click on them
 and go to the TestNG-> click on Convert to TestNG  and give a name to that and click finish then we get
 testng.xml file is created under test-output */
	
	@Test
	public void logout() throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(1000);
		// Accept cookies
		driver.findElement(By.xpath("//div[text()='Accept all']")).click();
		// Search on google textArea
		Thread.sleep(1000);
		List<WebElement> searchOnGoogle = driver.findElements(By.tagName("textarea"));

		WebElement type = searchOnGoogle.get(0);
		type.sendKeys("Amazon");
				
	}
	

}
