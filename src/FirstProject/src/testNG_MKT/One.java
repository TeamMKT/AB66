package testNG_MKT;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class One
{
  @Test
  public void login() throws InterruptedException
  {
	  ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.Amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement w1=driver.findElement(By.id("twotabsearchtextbox"));
		w1.sendKeys("Kitchen Tools");
		w1.sendKeys(Keys.ENTER);
  }
}
