package testngprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase1_AmazonSearch extends BaseTest
{
	@Test(retryAnalyzer=RetryLogic.class)
	public void searchingTheProduct()
	{
		WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("toys"+Keys.ENTER);
		
	}
	
}
