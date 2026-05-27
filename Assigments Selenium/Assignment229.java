package com.java.program.modul4.java.selenium.assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment229 {
// Write a programe to laucnh Amazona  and click on mobiles (By using linktext beacuse these are links)

	public static void main(String[] args) throws InterruptedException {
	        ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in");	
			Thread.sleep(2000);
		// Maximize window	
			driver.manage().window().maximize();
			
			String title = driver.getTitle();
			System.out.println(title);
			
			String currentURL = driver.getCurrentUrl();
			System.out.println(currentURL);
			
			WebElement link =driver.findElement(By.linkText("Mobiles"));  
			Thread.sleep(2000);
		//  first extract the text from linktext	
			 String   getText =  link.getText();
			 System.out.println(getText);
		//  then click	 
		    link.click();
		    Thread.sleep(2000);
		    
		//  get url of the current page 
		   String   actualcurrentUrl = driver.getCurrentUrl();
		   System.out.println(actualcurrentUrl);
		   
		   String expectedUrl = "https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles";
		   		
		   
		// verify cuurent url with expected url
		   if(actualcurrentUrl.equals( expectedUrl))
		   {
			   System.out.println("matched");
		   }
		   else
		   {
			   System.out.println("Not matched");
		   }
		   
		    
		    String  parentW = driver.getWindowHandle();
			System.out.println( "parentW :"+ parentW );
			
			Set<String> allWindows =driver.getWindowHandles();
			System.out.println(allWindows); 
			
		    
		    
			
			
		

	}

}
