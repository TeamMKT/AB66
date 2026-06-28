package testNG_MKT;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class Reportlog_Testcase1_AmazonSearch2 extends BaseTest
{
	@Test
	public void searchingtheproduct() throws InterruptedException
	{ 
		Reporter.log("Browser launch and URl launch succesfully");
		WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("Toys"+Keys.ENTER);
		Thread.sleep(3000);
		Reporter.log("Searching the product");
		
		
	}
	
	
}
   
