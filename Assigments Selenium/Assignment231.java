package com.java.program.modul4.java.selenium.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment231 {
/*"Write a Script  to automate 
	 https://grotechminds.com/registeration-form/
     using id,name ,tagname,linkText,partialLinktext locater
      note:-Dont automate gender,state,checkbox and Register" */
	
	public static void main(String[] args) throws InterruptedException {
		
	         ChromeDriver driver = 	new ChromeDriver();
	         driver.get("https://grotechminds.com/registeration-form/");
	         
	         driver.manage().window().maximize();
	         
	        String  title =  driver.getTitle();
	        System.out.println(title);
	        
	        String currentURL = driver.getCurrentUrl();
	        System.out.println("CurrentURL :"+currentURL);
	        
	        
	        WebElement firstName =  driver.findElement(By.id("firstName")); // xpath //input[@id='firstName']
	        firstName.sendKeys("lalitha");
	        
	        firstName.sendKeys(Keys.ENTER);
	        
	        WebElement lastName =  driver.findElement(By.name("lastName"));
	        lastName.sendKeys("V");
	        
	        WebElement gmail =  driver.findElement(By.id("email"));
	        gmail.sendKeys("lalithadevi@gmail.com");
	        
	        
	        WebElement phone =  driver.findElement(By.id("phone"));
	        phone.sendKeys("8412808484");
	        Thread.sleep(1000);
	   // handiling drop downs     
	       WebElement gender =  driver.findElement(By.xpath("//select[@id='gender']"));
	     /*   Select options = new Select(gender);
	        
	      //  options.selectByValue("female");
	        options.selectByVisibleText("Male");
	     //   options.selectByIndex(0);
	        */
	        
	       gender.sendKeys(Keys.ARROW_DOWN) ;
	       Thread.sleep(1000);
	       gender.sendKeys(Keys.ARROW_DOWN) ;
	       Thread.sleep(1000);
	    //   gender.sendKeys(Keys.ARROW_DOWN) ;
	   //    Thread.sleep(1000);
	    //    (Keys.CONTROL+"a");
	        
	        
	        
;	         
	         
	 
		

	}

}
