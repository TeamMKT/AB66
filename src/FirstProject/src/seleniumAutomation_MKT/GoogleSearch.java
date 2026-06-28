package seleniumAutomation_MKT;

import java.util.concurrent.ConcurrentHashMap.KeySetView;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch
{
   public static void main(String[] args) throws InterruptedException 
   {
	   ChromeDriver driver = new ChromeDriver();
	   driver.get("https://www.google.com");
	   driver.manage().window().maximize();
	   Thread.sleep(3000);
	   WebElement e1 = driver.findElement(By.name("q"));
	   e1.sendKeys("India Country" + Keys.ENTER);
	   
	   
	   
	   
}
}
