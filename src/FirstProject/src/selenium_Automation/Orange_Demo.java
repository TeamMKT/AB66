package selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange_Demo 
{
  public static void main(String[] args) throws InterruptedException 
  {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	WebElement w1 = driver.findElement(By.name("username"));
	w1.sendKeys("Admin");
	WebElement w2 = driver.findElement(By.name("password"));
	w2.sendKeys("admin123");
	WebElement w3 = driver.findElement(By.name("password"));
	w3.sendKeys("admin123");
	
	
}
}
