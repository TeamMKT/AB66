package com.java.program.modul4.java.selenium.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment236 {
/*" 
    
WAP to print each URL of all the Links in the given page of a website
(google)" */

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.in");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
	// Accept cookies
		driver.findElement(By.xpath("//div[text()='Accept all']")).click();
		Thread.sleep(1000);
		
		 List<WebElement> allURLs =driver.findElements(By.tagName("a"));
		 Thread.sleep(3000);
		 
		 
		 for(int i =0; i<allURLs.size(); i++)
		 {
			WebElement urls =allURLs.get(i);
			String  text =urls.getText();
			 String  links =urls.getDomAttribute("href");
			 System.out.println(text+ " "+links+" "+i);
			 
		 }
		
		 driver.close();

	}

}
