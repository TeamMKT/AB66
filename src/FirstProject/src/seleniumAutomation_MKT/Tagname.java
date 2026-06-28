package seleniumAutomation_MKT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname 
{
   public static void main(String[] args) throws InterruptedException 
   {
	   ChromeDriver driver = new ChromeDriver();
	   driver.get("https://www.google.com");
	   driver.manage().window().maximize();
	   Thread.sleep(2000);
	   WebElement w1 = driver.findElement(By.tagName("textarea"));
	   w1.sendKeys("India country");
}
}

