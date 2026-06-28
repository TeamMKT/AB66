package selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteX_path 
{
   public static void main(String[] args) throws InterruptedException
   {
	   ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement E1 = driver.findElement(By.xpath("(/html/body/div/div/form/div/div/div/div/div/textarea)"));
		E1.sendKeys("India Country");
} 
}


