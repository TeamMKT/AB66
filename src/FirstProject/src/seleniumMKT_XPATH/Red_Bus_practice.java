package seleniumMKT_XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Red_Bus_practice
{
  public static void main(String[] args) throws InterruptedException 
  {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.redbus.in/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	WebElement w1 = driver.findElement(By.xpath("//img[@alt='Online Bus Tickets Booking']"));
	w1.click();
	Thread.sleep(3000);
	WebElement w2 =driver.findElement(By.xpath("//input[@id='txtSource']"));
	w2.sendKeys("Visakhapatnam");
	/*WebElement w3 =driver.findElement(By.xpath("//i@class='icon icon-doublearrow D120_swap']"));
	w3.sendKeys("Visakhapatnam");*/
	WebElement w4 =driver.findElement(By.xpath("//i[@placeholder='TO']"));
	w4.sendKeys("Hyderabad");
	
	
}
}
