package com.java.program.modul4.java.selenium.assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment221 {
/*" Write a programe for
	getWindowHandle and getWindowHandles method" */

	public static void main(String[] args) throws InterruptedException {
		
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in");	
	Thread.sleep(2000);
	
	String title = driver.getTitle();
	System.out.println(title);
	
	String currentURL = driver.getCurrentUrl();
	System.out.println(currentURL);
	
	
	WebElement search =driver.findElement(By.xpath("//input[@id ='twotabsearchtextbox']"));
	search.sendKeys("mobiles"+Keys.ENTER);
	
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://www.facabook.in");
	
	String  parentW = driver.getWindowHandle();
	System.out.println( "parentW :"+ parentW );
	
	Set<String> allWindows =driver.getWindowHandles();
	System.out.println(allWindows); 
	

	}

}
