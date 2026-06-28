package seleniumAutomation_MKT;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser 
{
   public static void main(String[] args) throws InterruptedException
   {
	  ChromeDriver driver = new ChromeDriver();
	  EdgeDriver driver1 = new EdgeDriver();
	  FirefoxDriver driver2 = new FirefoxDriver();
           driver.get("https://google.com");
           Thread.sleep(3000);
           driver.close();
           
	  
}
}

           