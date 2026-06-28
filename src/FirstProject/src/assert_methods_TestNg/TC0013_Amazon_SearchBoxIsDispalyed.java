package assert_methods_TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC0013_Amazon_SearchBoxIsDispalyed 
{
	@Test
    public void fresh() throws InterruptedException
	{
	  ChromeOptions options =  new ChromeOptions();
	  options.addArguments("maximize");
	  WebDriver driver= new ChromeDriver(options);
	  driver.get("https://www.amazon.in/ap/signin?openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  
	  WebElement signin = driver.findElement(By.xpath("//input[@type='email']"));
	  signin.sendKeys("8500448418"+Keys.ENTER);
	  Thread.sleep(3000);
	  
	  WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
	  password.sendKeys("Grps@2007"+Keys.ENTER);
	  Thread.sleep(3000);
	  
	 WebElement searchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	 //searchbox.sendKeys("Shoes");


	//Assert.assertTrue(searchbox.isDisplayed(), "Sorry-The search box is not displayed");
	
	Assert.assertTrue(searchbox.isEnabled(), "Sorry-The search box is not Enabled");
			
	
		 
   
}
}