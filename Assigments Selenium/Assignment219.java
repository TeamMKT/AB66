package com.java.program.modul4.java.selenium.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment219 {
//Write a programe for  gettitle method 

	public static void main(String[] args) {
		// launch Browser
		ChromeDriver driver = new ChromeDriver();
//Navigate Goole Url by using get(URL String);
		driver.get("https://www.google.com");
// Accept cookies
		driver.findElement(By.xpath("//div[text()='Accept all']")).click();
// Get title 
		String  titleOFPage = driver.getTitle();
//Print title Actual tittle
		System.out.println(titleOFPage);
//Verify title of Page 
		if(titleOFPage.equals("Google"))
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Not Same");
		}
		
		WebElement searchOnGoogle = driver.findElement(By.id("APjFqb"));
		searchOnGoogle.sendKeys("Amazone");
		searchOnGoogle.sendKeys(Keys.ENTER);

// close current window
		driver.close();
// close all windows
		driver.quit();

	}

}
