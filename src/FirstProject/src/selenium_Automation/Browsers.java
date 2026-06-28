package selenium_Automation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsers {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		FirefoxDriver driver1 = new FirefoxDriver();
		EdgeDriver driver2 = new EdgeDriver ();
		driver.get("https:\\google.com");
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
