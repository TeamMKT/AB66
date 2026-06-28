package selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Flipcart_Hoverover 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement Login = driver.findElement(By.xpath("//span[text()='✕']"));
		Login.click();
		Thread.sleep(3000);
		
		Actions a1 = new Actions(driver);
		
		WebElement E1 = driver.findElement(By.xpath("//span[text()='Login']"));
		a1.moveToElement(E1).perform();
		Thread.sleep(3000);
		
		WebElement E2 = driver.findElement(By.xpath("//div[text()='Orders']"));
		E2.click();
		Thread.sleep(3000);
		
		WebElement login = driver.findElement(By.xpath("//input[@class='c3Bd2c yXUQVt']"));
		login.sendKeys("8500448418");
		
		WebElement E4 = driver.findElement(By.xpath("//button[text()='Request OTP']"));
		E4.click();
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
		
	
}
}
