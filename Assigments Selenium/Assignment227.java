package com.java.program.modul4.java.selenium.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment227 {
/*"navigate this url ""https://www.facebook.com/login
	by using name loacter automate the fields " */
	public static void main(String[] args) throws InterruptedException {
	   ChromeDriver driver = 	new ChromeDriver();
	   driver.get("https://www.facebook.com/login");
	   Thread.sleep(2000);
	   
	   driver.manage().window().maximize();
// Accept cokkies   
	   driver.findElement(By.xpath("(//span[text()='Allow all cookies'])[2]")).click();
	   Thread.sleep(1000);
// 
	   WebElement userEmail = driver.findElement(By.name("email"));
	   userEmail.sendKeys("lalith@gmail");
	   
	   WebElement userPassWord = driver.findElement(By.name("pass")); 
	   userPassWord.sendKeys("lalitha@30");
	   
	   driver.close();
	   
	   
		

	}

}
