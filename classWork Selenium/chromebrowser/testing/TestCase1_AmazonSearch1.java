package com.testng.chromebrowser.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase1_AmazonSearch1 extends BaseTest1 {
	
	@Test
	public void searchingTheProduct()
	{
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("Toys"+Keys.ENTER);
	}
		
	

}
