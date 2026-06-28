package testNG_MKT;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListnerLogic.class)
public class Testcase2_AmazonSearchandClick extends BaseTest
{
	@Test(retryAnalyzer=RetryLogic.class)
	public void searchingandClinkingthefirstproduct() throws InterruptedException
	{
		WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("Toys"+Keys.ENTER);
		
		List <WebElement> e2 = driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
		e2.get(1000).click();
		
	}
}
