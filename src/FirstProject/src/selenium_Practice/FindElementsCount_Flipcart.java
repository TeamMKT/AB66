package selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsCount_Flipcart 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    List<WebElement> list= driver.findElements(By.tagName("a"));
	    Thread.sleep(2000);
	    /*int count=        list.size();
	    System.out.println(count);*/
	    
	  WebElement e1 = list.get(12);
	  e1.click();
	}
	     
}
