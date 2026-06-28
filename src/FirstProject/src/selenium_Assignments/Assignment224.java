package selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*Write a programe to lunch the browser and navigate https://www.amazon.in url and locate the webelement using id ,
  name locater perform opertions using sendkeys or click method*/
public class Assignment224 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  ChromeDriver driver = new ChromeDriver();
	  driver.get("https://www.amazon.in");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  WebElement w1 = driver.findElement(By.id("twotabsearchtextbox"));
	  w1.sendKeys("shoes");
	  WebElement w2 = driver.findElement(By.id("nav-search-submit-button"));
	  w2.click();
	  
	  
	            
}
}
