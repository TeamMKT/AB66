package assert_methods_TestNg;
import java.util.List;

//Login To AMazon->Search the product				
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC003_Amazon_SearchingProduct extends BaseTest_AmazonAssertions
{
  @Test
  public void searchproduct() throws InterruptedException
  {
	  WebElement e1 =  driver.findElement(By.xpath("//div[@id='nav-link-accountList']/descendant::div/following-sibling::span"));
		 Actions a1 = new Actions(driver);
		 a1.moveToElement(e1).perform();
		 Thread.sleep(3000);
		 
		 WebElement signInbutton = driver.findElement(By.xpath("//div[@id='nav-al-signin']"));
			signInbutton.click();
			Thread.sleep(3000);
			
			WebElement signInText =  driver.findElement(By.xpath("//div[@id='claim-collection-container']/h1"));
			 Thread.sleep(3000);
			 Assert.assertEquals(signInText.getText(), "Sign in or create account");

	  WebElement signin = driver.findElement(By.xpath("//input[@type='email']"));
	  signin.sendKeys("8500448418");
	  
	  WebElement continuebutton = driver.findElement(By.xpath("//input[@type='submit']"));
		continuebutton.click();
		Thread.sleep(3000);
		
	  WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
	  password.sendKeys("Grps@2007");
	  
	  WebElement signSubmit =driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		signSubmit.click();
		Thread.sleep(3000);
	  
	  WebElement searchproduct = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	  searchproduct.sendKeys("mobiles"+Keys.ENTER);
	  Thread.sleep(3000);
	  
	  List <WebElement> mobiles = driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
	  //Assert.assertEquals(mobiles.size()>50, true,"sorry-conditons cound not be match");
	  Assert.assertEquals(mobiles.size()>10, true,"sorry-conditons cound not be match");

	  
	  
	  
  }
}
