package seleniumAutomation_MKT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName 
{
   public static void main(String[] args) throws InterruptedException 
   {
	 ChromeDriver driver = new ChromeDriver();
	 driver.get("https://www.google.com");
	 driver.manage().window().maximize();
	 Thread.sleep(2000);
	 WebElement w1 = driver.findElement(By.className("gLFyf"));
	 w1.sendKeys("India Country");
	 
}
}
