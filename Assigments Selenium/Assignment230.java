package com.java.program.modul4.java.selenium.assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment230 {
/*"Write a progrmae laucnh 
	Amazon  and click on Customer Service" */

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
				
				WebElement link =driver.findElement(By.linkText("Customer Service"));  
				Thread.sleep(2000);
			//  first extract the text from linktext	
				 String   getText =  link.getText();
				 System.out.println(getText);
			//  then click	 
			    link.click();
			    Thread.sleep(2000);
			    
			// get currentURL after clicking an customer service link
			   String customerService = driver.getCurrentUrl();
			   System.out.println("customerService page :"+customerService );
			    
			    String  parentW = driver.getWindowHandle();
				System.out.println( "parentW :"+ parentW );
				
				Set<String> allWindows =driver.getWindowHandles();
				System.out.println(allWindows); 
				
		

	}

}
