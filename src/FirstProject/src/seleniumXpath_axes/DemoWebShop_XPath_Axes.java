package seleniumXpath_axes;

import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop_XPath_Axes 
{
  public static void main(String[] args) throws InterruptedException
  {
	  ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/?utm_source=chatgpt.com");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		
		
}
}
