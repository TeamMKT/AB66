package seleniumMKT_XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hoverover_Ebay
{
  public static void main(String[] args) throws InterruptedException
  {
	  ChromeDriver driver=new ChromeDriver();	
		driver.get("https://www.ebay.com/?utm_source=chatgpt.com");
		driver.manage().window().maximize();
	
		Thread.sleep(3000);
		WebElement w1 =driver.findElement(By.xpath("//span[@class='gh-my-ebay__link gh-rvi-menu']"));
		
	Actions a1 = new Actions(driver);
	a1.moveToElement(w1).perform();
	Thread.sleep(3000);
	WebElement w3 =driver.findElement(By.xpath("//a[text()='Selling']"));
	w3.click();
	
	WebElement w2 =driver.findElement(By.xpath("//a[text()='Summary']"));
	w2.click();
	Thread.sleep(3000);
	
	
	
	
	
}
}
