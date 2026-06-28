package selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements_count
{
	public static void main(String[] args) throws InterruptedException
	  {
		  ChromeDriver driver= new ChromeDriver();
		   driver.get("https://www.google.com");
		     driver.manage().window().maximize();
		     Thread.sleep(3000);
		     List <WebElement> list = driver.findElements(By.tagName("a"));
		     int count = list.size();
		     System.out.println(count);
		     WebElement e1 = list.get(2);
		     System.out.println(e1);
		     e1.click();
		     
		  /*driver.get("https://www.amazon.in");
		     driver.manage().window().maximize();
		     Thread.sleep(3000);
		     List <WebElement> list = driver.findElements(By.tagName("a"));
		     int count = list.size();
		     System.out.println(count);
		     WebElement e2 = list.get(1);
		     System.out.println(e2);
		     e2.click();*/
		     
		 
          
		     
		     
		     
		     
}
}
