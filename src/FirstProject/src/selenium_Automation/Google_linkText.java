package selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_linkText 
{
   public static void main(String[] args) throws InterruptedException
   {
	   ChromeDriver driver = new ChromeDriver();
	   driver.get("https://grotechminds.com/payments/");
	   driver.manage().window().maximize();
	   Thread.sleep(3000);
	   WebElement e1 = driver.findElement(By.id("cardNumber"));
	   e1.sendKeys("123456789");
	   WebElement e2 = driver.findElement(By.id("expiryDate"));
	   e2.sendKeys("12/2023");
	   WebElement e3 = driver.findElement(By.id("cvv"));
	   e3.sendKeys("123");
	   WebElement e4 = driver.findElement(By.id("amount"));
	   e4.sendKeys("250000");
	   WebElement e5 = driver.findElement(By.id("currency"));
	   e5.sendKeys("INR");
	   WebElement e6 = driver.findElement(By.id("saveCard"));
	   e6.click();
	   WebElement e7 = driver.findElement(By.id("submit"));
	   e7.click();
	   
	   
	   
	   
	   
	   
	   
	   
	   
} 
}
