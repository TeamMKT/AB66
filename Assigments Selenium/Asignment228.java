package com.java.program.modul4.java.selenium.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asignment228 {
// Write a progrmar to Launch Google and click on Gmail (by using Linktext)

	public static void main(String[] args) {
	// launch Browser
		ChromeDriver driver = new ChromeDriver();
   //Navigate Goole Url by using get(URL String);
		driver.get("https://www.google.com");
   // Accept cookies
		driver.findElement(By.xpath("//div[text()='Accept all']")).click();
   // click gmail
		WebElement gmail =driver.findElement(By.linkText("Gmail"));
		gmail.click();
		

	}

}
