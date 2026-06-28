package testNG_Browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase2_Facebooksignin extends BaseTestT
{
  @Test
  public void facebookpasswordsignin()
  {
	  WebElement password = driver.findElement(By.name("pass"));
	     password.sendKeys("Grps@2007" + Keys.ENTER);
  }
}
