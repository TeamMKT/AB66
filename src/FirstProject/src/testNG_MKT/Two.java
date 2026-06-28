package testNG_MKT;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Two 
{
  @Test
  public void logout() throws InterruptedException
  {
	  ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		     WebElement w1 = driver.findElement(By.name("email"));
		     w1.sendKeys("geeta.meduri@gamil.com");
		     WebElement w2 = driver.findElement(By.name("pass"));
		     w2.sendKeys("Grps@2007" + Keys.ENTER);
  }
}
