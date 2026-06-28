package seleniumXpath_axes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggession_XPathAxes 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  ChromeDriver driver = new ChromeDriver();
	  driver.get("https://google.com");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  
	  WebElement Search = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
	  Search.sendKeys("India country");
	  
	  Thread.sleep(3000);
	  
	  List <WebElement> child = driver.findElements(By.xpath("//ul[@role='listbox']/child::li"));
	  int count = child.size();
	  System.out.println(count);
	  Thread.sleep(3000);
	  
	  
	  
	  
	  
}
  
}
