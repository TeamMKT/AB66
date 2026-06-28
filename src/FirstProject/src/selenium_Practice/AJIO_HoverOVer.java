package selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AJIO_HoverOVer 
{
  public static void main(String[] args) throws InterruptedException {
	  ChromeDriver driver=new ChromeDriver();	
		driver.get("https://www.ajio.com/?utm_source=chatgpt.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
			
		WebElement boys = driver.findElement(By.xpath("//div[text()='WOMEN']"));
		
		Actions a1 = new Actions(driver);
		a1.moveToElement(boys).perform();
		
		Thread.sleep(3000);
		
		
		WebElement categories = driver.findElement(By.xpath("//span[text()='CATEGORIES']"));
		a1.moveToElement(categories).perform();
		Thread.sleep(4000);
		
		WebElement clothing = driver.findElement(By.xpath("//span[text()='CLOTHING']"));
		a1.moveToElement(clothing).perform();
		clothing.click();
		Thread.sleep(4000);
		
		
		
		
		
			
}
}
