package com.java.program.modul4.java.selenium.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment234 {
//Write a script  to fetch all linktext of webpage.use url:-https://www.google.in

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
    // Accept cookies
		driver.findElement(By.xpath("//div[text()='Accept all']")).click();
		Thread.sleep(1000);
		
	// Fetch all linkText of this page	
		List<WebElement> linkTextsOfAllLinks = driver.findElements(By.tagName("a"));
		Thread.sleep(3000);
		
	// Count all linktexts
		int  count = linkTextsOfAllLinks.size();
		System.out.println("count of all linkTexts :"+count);
		Thread.sleep(4000);
		
	// Get all
		for(int i=0 ;i<linkTextsOfAllLinks.size(); i++)  //linkTextsOfAllLinks.size
		{
			WebElement links = linkTextsOfAllLinks.get(i);
			String  linkText =links.getText();
			System.out.println(linkText+" "+i);
			
		}
		Thread.sleep(3000); 
		
		driver.close();
		
	

	}

}
