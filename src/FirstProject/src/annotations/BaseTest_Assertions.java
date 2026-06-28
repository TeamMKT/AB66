package annotations;

import java.sql.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest_Assertions extends Listeners_Logic
{
@Parameters("browsers")
   @BeforeMethod
   public void launchbrowsers(String browsers) throws InterruptedException
   {
	   if(browsers.equals("chrome"))
	   {
		   driver = new ChromeDriver();
	   }
	   if(browsers.equals("edge"))
	   {
		   driver = new EdgeDriver();
	   }
	   if(browsers.equals("firefox"))
	   {
		   driver = new FirefoxDriver();
	   }
	   driver.get("https://www.amazon.in");
		  driver.manage().window().maximize();
	   Thread.sleep(3000);
   }
@AfterMethod
public void quitBrowser() throws InterruptedException
{
	   driver.quit();
	   Thread.sleep(3000);
}
}

