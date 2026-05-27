package com.java.program.modul4.java.selenium.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment233 {
//Write a script automate webelement using findElements.

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver	driver = new ChromeDriver();
	driver.get("https://www.google.com");
	Thread.sleep(1000);
// Accept cookies
			driver.findElement(By.xpath("//div[text()='Accept all']")).click();
// Search on google textArea
			Thread.sleep(1000);
			List<WebElement> searchOnGoogle = driver.findElements(By.tagName("textarea"));
			
			            WebElement   type = searchOnGoogle.get(0);
			            type.sendKeys("Amazon");
			
		

	}

}
