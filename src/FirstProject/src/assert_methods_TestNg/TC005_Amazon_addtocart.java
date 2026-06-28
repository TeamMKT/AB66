package assert_methods_TestNg;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC005_Amazon_addtocart extends BaseTest_AmazonAssertions
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
	  
	 /* WebElement searchproduct = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	  searchproduct.sendKeys("shoes for women"+Keys.ENTER);
	  Thread.sleep(5000);*/
	  
	    WebElement product1= driver.findElement(By.xpath("//a[@class='a-link-normal s-no-outline'][1]"));
	    product1.click();
	    Thread.sleep(3000);
	    
	   Set <String> pcid =  driver.getWindowHandles();
	   System.out.println(pcid);
	   Iterator<String> id = pcid.iterator();
	   String parentid =  id.next();
	   String childid= id.next();
	   driver.switchTo().window(childid);
	   Thread.sleep(3000);
	   //mobiles-(//input[@id='add-to-cart-button'])[2]
	    WebElement addtocart=  driver.findElement(By.xpath("(//span[@id='submit.add-to-cart'])[2]"));
	    addtocart.click();
	    Thread.sleep(3000);
	    
	   String title =  driver.getCurrentUrl();
	   Assert.assertEquals(title.matches("(.*)cart(.*)"), true,"Sorry-But the condition did not match 1st assertion failed");
	   
	   WebElement addtocartmess= 
			   //driver.findElement(By.xpath("//div[@id='NATC_SMART_WAGON_CONF_MSG_SUCCESS']/h1"));
	   driver.findElement(By.xpath("//div[@class='a-section attach-base-atc-success']/span[text()=' Added to cart']"));
	 
	   Assert.assertEquals(addtocartmess.getText(), "Added to cart", "sorry-condition did not match");
	   
	   
	    
	 
	
	    
	    

	   
	   
	   
	   
	   
	   
	    
	    
	    
	    
	  
	    
	  
	  
  }
}
