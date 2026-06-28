package seleniumAutomation_MKT;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Driver_methods 
{
   public static void main(String[] args) throws InterruptedException 
   {
	  ChromeDriver driver = new ChromeDriver();
	  driver.get("https://google.com");
	  Thread.sleep(3000);
	  String title = driver.getTitle();
	  System.out.println(title);
	  String url = driver.getCurrentUrl();
	  System.out.println(url);
	  
	  String parentid = driver.getWindowHandle();
	  System.out.println(parentid);
	  
	 Set<String> childid = driver.getWindowHandles();
	 System.out.println(childid);
	  
	  
}
}
