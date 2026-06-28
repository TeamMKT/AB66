package testNG_Browsers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase1_SearchingtheProduct extends BaseTest2
{
  @Test
  public void searchingtheproduct()
  {
	  WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
	  e1.sendKeys("Mobiles");
  }
  @Test
  public void prodctAutosuggesstions() throws InterruptedException
  {
	  WebElement e2 = driver.findElement(By.id("twotabsearchtextbox"));
	  e2.sendKeys("Mobiles");
	  Thread.sleep(2000);
  List <WebElement> list = driver.findElements(By.xpath("//div[@role='rowgroup']/div/div"));
  int count = list.size();
  System.out.println("Mobiles autosuggestion is:" + count);
  Thread.sleep(3000);
  }
}
