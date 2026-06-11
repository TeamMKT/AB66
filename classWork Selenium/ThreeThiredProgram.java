package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ThreeThiredProgram {
	
	@Test
	public void refresh() throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Dell/Downloads/learningHTML1%20(1).html");
		driver.manage().window().maximize();
		Thread.sleep(1000);

		WebElement firstName = driver.findElement(By.xpath("//input[@name='username']"));
		if (firstName.isDisplayed() && firstName.isEnabled()) {
			System.out.println("Text field is dispalyed and enabled");
			if (!(firstName.isSelected())) {
				firstName.sendKeys("lalitha" + Keys.ENTER);
			} else {
				System.out.println("It is selected");
			}
		} else {
			System.out.println("It is not dispalyed and enabled mode");

		}

		WebElement hint = driver.findElement(By.xpath("//input[@name='say hello']"));
		if (hint.isDisplayed() && hint.isEnabled()) {
			System.out.println("Text field is dispalyed and enabled");
			if (!(hint.isSelected())) {
				hint.sendKeys("l2" + Keys.ENTER);
			} else {
				System.out.println("It is selected");
			}
		} else {
			System.out.println("It is not dispalyed and enabled mode");

		}

		WebElement lNmae = driver.findElement(By.xpath("//input[@name='lname']"));
		if (lNmae.isDisplayed() && lNmae.isEnabled()) {
			System.out.println("Text field is dispalyed and enabled");
			if (!(lNmae.isSelected())) {
				lNmae.sendKeys("l2" + Keys.ENTER);
			} else {
				System.out.println("It is selected");
			}
		} else {
			System.out.println("It is not dispalyed and enabled mode");

		}

		// input[@name='lname']
	}

}
