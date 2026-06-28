package testNG_Browsers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestCase2_DropdownOFAmazonproductslist extends BaseTest2
{
  @Test
  public void dropdownlist()
  {
	  WebElement E1 = driver.findElement(By.xpath("//option[text()='All Categories']/parent::select"));
	  
	  Select s1 = new Select(E1);
	  
	  //s1.selectByVisibleText("Amazon Pharmacy");
	  //s1.selectByValue("search-alias=alexa-skills");
	  s1.selectByIndex(5);
  }
	  
  @Test
  public void amazonlinks()
  {
	  List <WebElement> list =  driver.findElements(By.tagName("a"));
	  int count = list.size();
	  System.out.println("Number od links in amazon:" + count);
  }
	  
 
}
