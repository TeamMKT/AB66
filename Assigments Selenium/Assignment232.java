package com.java.program.modul4.java.selenium.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment232 {
//Write a script to automate give url https://grotechminds.com/payments/

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = 	new ChromeDriver();
	driver.get("https://grotechminds.com/payments/");
	
	driver.manage().window().maximize();
	Thread.sleep(1000);
	
	String  title = driver.getTitle();
	String  Url = driver.getCurrentUrl();
	Thread.sleep(1000);
	
	System.out.println(title);
	System.out.println(Url);
	
	WebElement cardNum = driver.findElement(By.id("cardNumber"));
	cardNum.sendKeys("At001754327654");
	Thread.sleep(1000);
	
	WebElement expiryDate = driver.findElement(By.name("expiryDate"));
	expiryDate.sendKeys("25/2027");
	Thread.sleep(1000);
	
	WebElement cvv = driver.findElement(By.id("cvv"));
	cvv.sendKeys("1234");
	Thread.sleep(1000);
// select dropdown	
//	WebElement cardType = driver.findElement(By.id("cardType"));
	
	// count how many options are there in drop down 
/*	List<WebElement> options1 = driver.findElements(By.xpath("//select[@id='cardType']/option"));
	 int count =options1.size();
	 System.out.println("count of drop down :"+count);
	 Thread.sleep(1000);
	 for(int i =0; i<count;i++)
	 {
		 WebElement option = options1.get(i);
		 String optionsText = option.getText();
		 System.out.println("optionsText :"+optionsText);
	 }
	 Thread.sleep(1000); */
/*	 cardType.click();
	 Thread.sleep(3000);
	 cardType.sendKeys(Keys.ARROW_DOWN);
	 Thread.sleep(1000);
	 cardType.sendKeys(Keys.ARROW_DOWN); */
// selecting dropdwon by using Select class	
/*	Select options = new Select(cardType);
	options.selectByIndex(2); */
	
	WebElement span = driver.findElement(By.id("select2-cardType-container"));
	Select s = new Select(span);
	s.selectByIndex(2);
	
	
/*	span.click();
	Thread.sleep(2000);
	span.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(1000);
	span.sendKeys(Keys.ARROW_DOWN);
	span.sendKeys(Keys.ENTER); */
	 
	
	 WebElement chkBox = driver.findElement(By.id("saveCard"));
		chkBox.click();
		Thread.sleep(1000);
	
	
	
	
	
	
	
	

	}

}
