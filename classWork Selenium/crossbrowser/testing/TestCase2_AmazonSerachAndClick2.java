package com.testng.crossbrowser.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase2_AmazonSerachAndClick2 extends BaseTest2{
	@Test
	public void searchingTheProductAndClick()
	{
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("Toys"+Keys.ENTER);
		driver.findElement(By.xpath("//a[@class='a-link-normal s-no-outline']")).click();

		
	}

}
