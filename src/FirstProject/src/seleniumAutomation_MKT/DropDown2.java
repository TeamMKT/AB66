package seleniumAutomation_MKT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 
{
  public static void main(String[] args) throws InterruptedException
  {
       ChromeDriver driver = new ChromeDriver();
       driver.get("https://www.facebook.com/reg/");
       driver.manage().window().maximize();
       Thread.sleep(3000);
      WebElement e1 =  driver.findElement(By.xpath("//span[@class='x12scifz xmper1u x1n6qoib x1sfkdl8 x3vd66c x193iq5w x47corl xlyipyv xuxw1ft xpjqbc8 xzwoauc x9etu39 x6ikm8r x10wlt62 x10l6tqk xt2fmrd x1al4vs7 xii2z7h x11xpdln x1r7x56h']"));
     e1.click();
    
      
      
       
}
}
