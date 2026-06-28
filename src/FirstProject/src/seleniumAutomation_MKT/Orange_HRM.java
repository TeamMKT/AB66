package seleniumAutomation_MKT;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange_HRM 
{
  public static void main(String[] args) throws InterruptedException 
  {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	/* WebElement a = driver.findElement(By.xpath("//input[@name='username']"));
	 a.sendKeys("admin");
	 WebElement b = driver.findElement(By.xpath("//input[@name='password']"));
	 b.sendKeys("admin123");
	 b.sendKeys(Keys.ENTER);*/
	WebElement c = driver.findElement(By.xpath("(//input)[2]"));
	c.sendKeys("admin");
	WebElement d = driver.findElement(By.xpath("(//input)[3]"));
	d.sendKeys("admin123");
	d.sendKeys(Keys.ENTER);
	
	
}
}
