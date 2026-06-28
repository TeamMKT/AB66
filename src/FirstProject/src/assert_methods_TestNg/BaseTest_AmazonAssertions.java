package assert_methods_TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest_AmazonAssertions 
{
	WebDriver driver;
 @BeforeMethod()
	 public void launchbrowser() throws InterruptedException
	 {
	 ChromeOptions options =  new ChromeOptions();
	  options.addArguments("maximize");
	  driver= new ChromeDriver(options);
	  driver.get("https://www.amazon.in");
	  //driver.get("https://www.amazon.in/ap/signin?openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  
	
	 
	 }
@AfterMethod
public void quitbrwoser()
{
	driver.quit();
}
}
