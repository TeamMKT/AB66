package testNG_MKT;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class Reportlog_Testcase2_AmazonSearchandClick2 extends BaseTest
{
	@Test
	public void searchingandClinkingthefirstproduct() throws InterruptedException
	{
		Reporter.log("Browser launch and URl launch succeessfully");
		WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("Toys"+Keys.ENTER);
		Thread.sleep(3000);
		Reporter.log("Searching the product");
		
		List <WebElement> e2 = driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
		e2.get(0).click();
		Thread.sleep(3000);
		Reporter.log("Clicking on the first product");
		
	}
}
