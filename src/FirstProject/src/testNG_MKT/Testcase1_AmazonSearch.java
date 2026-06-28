package testNG_MKT;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListnerLogic.class)
public class Testcase1_AmazonSearch extends BaseTest
{
	@Test(retryAnalyzer=RetryLogic.class)
	public void searchingtheproduct() throws InterruptedException
	{ 
		
		WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("Toys"+Keys.ENTER);
		
	}
	
	
}
   
