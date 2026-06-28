package selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hoverover 
{
  public static void main(String[] args) throws InterruptedException 
  {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://jqueryui.com/menu/?utm_source=chatgpt.com");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	driver.switchTo().frame(iframe);
	Thread.sleep(3000);
	
	Actions a1 = new Actions(driver);
	
	WebElement E1  = driver.findElement(By.xpath("//div[@id='ui-id-4']"));
	a1.moveToElement(E1).perform();
	Thread.sleep(3000);
	
    WebElement E2  = driver.findElement(By.xpath("//div[@id='ui-id-6']"));
	a1.moveToElement(E2).perform();
	E2.click();
	Thread.sleep(4000);
	
	WebElement E3  = driver.findElement(By.xpath("//div[@id='ui-id-9']"));
	a1.moveToElement(E3).perform();
	Thread.sleep(3000);
	
	WebElement E4  = driver.findElement(By.xpath("//div[@id='ui-id-13']"));
	a1.moveToElement(E4).perform();
	Thread.sleep(4000);
	
	WebElement E5  = driver.findElement(By.xpath("//div[@id='ui-id-14']"));
	a1.moveToElement(E5).perform();
	Thread.sleep(4000);
	E5.click();
	
	
	
	
	
	
}
}
