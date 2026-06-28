package selenium_Practice;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle_Handles 
{
  public static void main(String[] args) throws InterruptedException
  {
	  ChromeDriver driver= new ChromeDriver();
	     driver.get("https://www.amazon.in");
	     driver.manage().window().maximize();
	     Thread.sleep(3000);
	     String parentid = driver.getWindowHandle();
	     System.out.println(parentid);
	    Set< String> pcid = driver.getWindowHandles();
	     System.out.println(pcid);
	     

        /* String parentid=        driver.getWindowHandle();
         System.out.println(parentid);
         Set<String> pcid=        driver.getWindowHandles();
         System.out.println(pcid);*/
	     
	     
}
}
