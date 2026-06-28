package testNG_Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest_Quikr 
{
	WebDriver driver;
  @BeforeMethod
  public void launchbrowser() throws InterruptedException
  {
	  ChromeOptions options = new ChromeOptions();
		 options.addArguments("disable-notifications");
		  driver = new ChromeDriver(options);
		 driver.get("https://www.quikr.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
  }

  @AfterMethod()
	  public void quitBrowser() throws InterruptedException
	  {
		  Thread.sleep(3000);
		  driver.quit();
	  }
  }

