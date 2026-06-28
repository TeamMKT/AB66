package bookMyShow;
//1. Launch https://in.bookmyshow.com/e->select your city->search for a movie called anything u wish
//2. Click on Book Tickets
//3. Click on signin
//4. Click on Continue with Google
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest
{
	ChromeDriver driver;
	 @BeforeMethod
	  public void launchofbrowser() throws InterruptedException
	  {
		  driver = new ChromeDriver();
			driver.get("https://in.bookmyshow.com/e");
			driver.manage().window().maximize();
			Thread.sleep(3000);
	  }
	  @AfterMethod
	  public void quitofbrowser() throws InterruptedException
	  {
		  Thread.sleep(3000);
		 driver.quit();
	  }
	}


