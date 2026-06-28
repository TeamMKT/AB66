package testNG_MKT;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonSignin2 
{
  @Test
  public void amazonsignin() throws InterruptedException
  {
  ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/ap/signin?openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_ya_signin%26adgrpid%3D155259813593%26hvpone%3D%26hvptwo%3D%26hvadid%3D809000348074%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D700384946211569121%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9147462%26hvtargid%3Dkwd-64107830%26hydadcr%3D14452_2459470%26gad_source%3D1&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	WebElement signin = driver.findElement(By.xpath("//input[@type='email']"));
	  signin.sendKeys("8500448418"+Keys.ENTER);
	  Thread.sleep(3000);
	  
	  WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
	  																																							password.sendKeys("Grps@2007"+Keys.ENTER);
	  Thread.sleep(3000);
	  
	  
	  
	
	 WebElement e1 =  driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
	 
	 
	 Actions a1 = new Actions(driver);
	 a1.moveToElement(e1).perform();
	 

	  
	  WebElement e2 =  driver.findElement(By.xpath("//span[text()='Sign Out']"));
	  e2.click();
	  WebElement e3 =  driver.findElement(By.xpath("//div[@id='claim-collection-container']/h1"));
	  
	  

	  Assert.assertEquals(e3.getText(), "Sign in or create account");
	  
  }
}
