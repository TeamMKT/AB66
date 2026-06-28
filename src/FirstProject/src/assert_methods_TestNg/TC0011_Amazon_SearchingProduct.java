package assert_methods_TestNg;
import java.util.List;

//Login To AMazon->Search the product				
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC0011_Amazon_SearchingProduct extends BaseTest_AmazonAssertions
{
  @Test
  public void searchproduct() throws InterruptedException
  {
	  WebElement signin = driver.findElement(By.xpath("//input[@type='email']"));
	  signin.sendKeys("8500448418"+Keys.ENTER);
	  Thread.sleep(3000);
	  
	  WebElement  password = driver.findElement(By.xpath("//input[@type='password']"));
	  password.sendKeys("Grps@2007"+Keys.ENTER);
	  Thread.sleep(3000);
	  
	 
	  WebElement deliver = driver.findElement(By.xpath("//div[@id='glow-ingress-block']"));
		deliver.click();
		Thread.sleep(3000);
		
		
		String actualLocation = deliver.getText();

		Assert.assertTrue( actualLocation.contains("Meduri") && actualLocation.contains("530017"),"Location did not match");
	
	  

	  
	  
	  
  }
}
