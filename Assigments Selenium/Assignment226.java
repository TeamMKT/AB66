package com.java.program.modul4.java.selenium.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment226 {
/*"Write a programe to lunch the browser and locate the 
webelement using name " */

	public static void main(String[] args) {
		// launch Browser
				ChromeDriver driver = new ChromeDriver();
		//Navigate Goole Url by using get(URL String);
				driver.get("https://www.google.com");
		// Accept cookies
				driver.findElement(By.xpath("//div[text()='Accept all']")).click();
		// Search on google textArea
				
				WebElement searchOnGoogle = driver.findElement(By.name("q"));
			//	searchOnGoogle.sendKeys("Amazone");
			//	searchOnGoogle.sendKeys(Keys.ENTER);	

	}

}
