package testNG_Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTestT 
{	
  WebDriver driver;
  @Parameters("browser")
  @BeforeMethod
  public void launchingbrowser(String nameofbrowser) throws InterruptedException
  {
	  if(nameofbrowser.equals("chrome"))
	  {
		  driver = new ChromeDriver();
	  }
	  if(nameofbrowser.equals("edge"))
	  {
		  driver = new EdgeDriver();
	  }
	  if(nameofbrowser.equals("firefox"))
	  {
		  driver = new FirefoxDriver();
	  }
	  
	  driver.get("https://www.facebook.com");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
  }

  @AfterMethod
  public void quitbrowser() throws InterruptedException
  {
	  driver.quit();
	  Thread.sleep(2000);
  }
  
}
