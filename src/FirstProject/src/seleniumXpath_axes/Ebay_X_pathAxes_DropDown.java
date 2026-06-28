package seleniumXpath_axes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ebay_X_pathAxes_DropDown 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  ChromeDriver driver = new ChromeDriver();
	  driver.get("https://www.ebay.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  
	  WebElement E1 = driver.findElement(By.xpath("//option[text()='All Categories']/parent::select[@id='gh-cat']"));
	  
	  //WebElement E1 = driver.findElement(By.xpath("//option[text()='Books']/parent::select[@id='gh-cat']"));
	  
	  Select s1 =  new Select(E1);
	  s1.selectByVisibleText("Business & Industrial");
	  
	  
	  
}
}
