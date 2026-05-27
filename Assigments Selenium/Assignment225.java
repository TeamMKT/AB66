package com.java.program.modul4.java.selenium.assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment225 {
/*Write a programe to lunch the browser and navigate https://www.amazon.in url and locate the webelement using id 
	and perform opertion using Keys.ENTER */

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
		
		WebElement search =driver.findElement(By.xpath("//input[@id ='twotabsearchtextbox']"));
		search.sendKeys("mobiles"+Keys.ENTER);
		
		String  parentW = driver.getWindowHandle();
		System.out.println( "parentW :"+ parentW );
		
		Set<String> allWindows =driver.getWindowHandles();
		System.out.println(allWindows); 
		
		


	}

}
