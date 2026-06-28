package seleniumMKT_XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spanx_path 
{
   public static void main(String[] args) throws InterruptedException
   {
	  ChromeDriver driver = new ChromeDriver();
	  driver.get("https://www.amazon.in");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  WebElement e1 = driver.findElement(By.xpath("//span[text()='Fresh']"));
	  e1.click();
	
	  WebElement e2 = driver.findElement(By.xpath("//img[@alt='Amazon Fresh']"));
	  e2.click();
	  
	  
	  
	  
}
}
