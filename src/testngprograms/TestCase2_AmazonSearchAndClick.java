package testngprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase2_AmazonSearchAndClick extends BaseTest
{
	@Test(retryAnalyzer=RetryLogic.class)
	public void searchingTheProductClickingOn1st() throws InterruptedException
	{
		
		WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("toys"+Keys.ENTER);
		Thread.sleep(4000);
		List<WebElement> list=driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
		list.get(1000).click();
	}
}
