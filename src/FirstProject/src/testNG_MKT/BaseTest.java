package testNG_MKT;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest extends ListnerLogic
{
	ChromeDriver driver;//global varaible int a;
  @BeforeMethod
  public void launchofbrowser() throws InterruptedException
  {
	  driver = new ChromeDriver(); //a=100;
	  driver.get("https://www.amazon.in");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
  }
  @AfterMethod
  public void quitofbrowser()
  {
	  driver.quit();
  }
}
