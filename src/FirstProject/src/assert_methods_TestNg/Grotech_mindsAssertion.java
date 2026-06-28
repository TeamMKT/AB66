package assert_methods_TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Grotech_mindsAssertion
{
  @Test
  public void grotechMindspayment() throws InterruptedException
  {
	  ChromeDriver driver = new ChromeDriver();
	   driver.get("https://grotechminds.com/registeration-form/");
	   driver.manage().window().maximize();
	   Thread.sleep(3000);
	    
	   WebElement e1 = driver.findElement(By.id("firstName"));
	    e1.sendKeys("Geeta");
	    Assert.assertEquals(e1.getAttribute("value").equals("Geeta"),true);
	    
	    WebElement e2 = driver.findElement(By.id("lastName"));
	    e2.sendKeys("Meduri");
	    WebElement e3 = driver.findElement(By.id("email"));
	    e3.sendKeys("geeta.meduri@gmail.com");
	    WebElement e4 = driver.findElement(By.id("phone"));
	    e4.sendKeys("8500448418");
  }
}
