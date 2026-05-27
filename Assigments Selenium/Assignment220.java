package com.java.program.modul4.java.selenium.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment220 {
//Write a programe for fetching currentURL by using selenium 
	public static void main(String[] args) throws InterruptedException {
		
	

	
	/*		// launch Browser
			ChromeDriver driver = new ChromeDriver();
	//Navigate Goole Url by using get(URL String);
			driver.get("https://www.google.com");
	// Accept cookies
			driver.findElement(By.xpath("//div[text()='Accept all']")).click();
	// Get title 
			String  titleOFPage = driver.getTitle();
	//Print title Actual tittle
			System.out.println("titleOFPage :"+titleOFPage);
	//Verify title of Page 
			if(titleOFPage.equals("Google"))
			{
				System.out.println("Same");
			}
			else
			{
				System.out.println("Not Same");
			}
	//Get currentUrl
			String currentURL = driver.getCurrentUrl();
	//print it 
			System.out.println("currentURL :"+currentURL);
	// Verify CurrentUrl
			
			
			WebElement searchOnGoogle = driver.findElement(By.id("APjFqb"));
			searchOnGoogle.sendKeys("Amazone");
			searchOnGoogle.sendKeys(Keys.ENTER);
			String currentURL1 = driver.getCurrentUrl();
			System.out.println("currentURL1 :"+currentURL);

	// close current window
	//		driver.close();
	// close all windows
	//		driver.quit(); */
			
			                ChromeDriver driver1=new ChromeDriver();        
			                driver1.get("https://www.amazon.in");
			                Thread.sleep(3000);
			                
			                String title=        driver1.getTitle();
			                System.out.println(title);
			                
			                
			                String url=        driver1.getCurrentUrl();
			                System.out.println(url);
			       
			
			
		

		

	}

}
