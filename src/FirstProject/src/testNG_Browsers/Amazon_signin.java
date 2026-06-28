package testNG_Browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Amazon_signin 
{
  @Test
  public void amazonsignin() throws InterruptedException
  {
	  ChromeOptions options =  new ChromeOptions();
	  options.addArguments("maximize");
	  WebDriver driver= new ChromeDriver(options);
	  driver.get("https://www.amazon.in/ap/signin?openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	  Thread.sleep(3000);
	  
	  WebElement signin = driver.findElement(By.xpath("//input[@type='email']"));
	  signin.sendKeys("8500448418"+Keys.ENTER);
	  Thread.sleep(3000);
	  
	  WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
	  password.sendKeys("Grps@2007"+Keys.ENTER);
	  Thread.sleep(3000);
	  
	  //Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	 // Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in","Sorry-title is not matching");
	  Assert.assertEquals(driver.getTitle(), "geeta Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in","Sorry-title is not matching");
	  
	
	 WebElement e1 =  driver.findElement(By.xpath("//span[@class='nav-line-2']"));
	 Actions a1 = new Actions(driver);
	 a1.moveToElement(e1).perform();
	 Thread.sleep(3000);
	 
	
	 WebElement e2 =  driver.findElement(By.xpath("//div[@id='nav-link-accountList']/descendant::div/following-sibling::span"));
	 e2.click();
	 Thread.sleep(3000);
	 
	
	 WebElement e3 =  driver.findElement(By.xpath("//div[@id='claim-collection-container']/h1"));
	 Thread.sleep(3000);
	 Assert.assertEquals(e3.getText(), "Sign in or create account");
	 

	 
	 


	  
	  
	  
	  
  }

}
