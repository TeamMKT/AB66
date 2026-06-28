package seleniumAutomation_MKT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown 
{
  public static void main(String[] args) throws InterruptedException
  {
       ChromeDriver driver = new ChromeDriver();
       driver.get("https://www.amazon.in");
       driver.manage().window().maximize();
       Thread.sleep(3000);
      WebElement e1 =  driver.findElement(By.xpath("//select[@name='url']"));
      e1.click();
      Select s1 = new Select(e1);
     // s1.selectByIndex(3);
      //s1.selectByVisibleText("Beauty");
      s1.selectByValue("search-alias=fashion");
      
      
       
}
}
