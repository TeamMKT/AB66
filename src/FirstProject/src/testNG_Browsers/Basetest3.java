package testNG_Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Basetest3 extends ListnerLogic1
{


@BeforeMethod
public void launchbrowsers() throws InterruptedException
{
	  driver = new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
}
@AfterMethod
public void quitBrowser() throws InterruptedException
{
	driver.quit();
}
}