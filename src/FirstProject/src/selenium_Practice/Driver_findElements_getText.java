package selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver_findElements_getText 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  ChromeDriver driver= new ChromeDriver();
	   driver.get("https://www.google.com");
	     driver.manage().window().maximize();
	     Thread.sleep(3000);
	     List <WebElement> list = driver.findElements(By.tagName("a"));
	     Thread.sleep(3000);
	     for(int i=0;i<list.size();i++)
	     {
	    	    WebElement e1 = list.get(i);
	    	       String text = e1.getText();
	    	       String url =e1 .getDomAttribute("href");
	    	       System.out.println(text);
	    	       System.out.println(url);
	     }
	     
}
}
