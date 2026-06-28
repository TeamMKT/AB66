package testNG_Browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase1_facebooklogin extends BaseTestT
{
  @Test
  public void facebookemail() 
  {
	  WebElement e1 = driver.findElement(By.name("email"));
	  e1.sendKeys("geeta.meduri@gmail.com" );
  }
}
