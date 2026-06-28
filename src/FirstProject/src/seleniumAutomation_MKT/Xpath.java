package seleniumAutomation_MKT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath 
{
   public static void main(String[] args) throws InterruptedException
   {
	   ChromeDriver driver = new ChromeDriver();
       driver.get("https://www.programiz.com/java-programming/online-compiler/");
       driver.manage().window().maximize();
      Thread.sleep(2000);
       WebElement a1 =driver.findElement(By.xpath("//span[@class='run-text']"));
       a1.click();
	
}
}
