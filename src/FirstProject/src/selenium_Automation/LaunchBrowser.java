package selenium_Automation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser 
{
	public static void main(String[] args) throws InterruptedException
	{
		
		ChromeDriver driver=new ChromeDriver();
	//	EdgeDriver driver1=new EdgeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		driver.close();
		
	}
}
