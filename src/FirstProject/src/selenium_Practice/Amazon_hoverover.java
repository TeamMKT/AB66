package selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_hoverover
{
    public static void main(String[] args) throws InterruptedException 
    {
    	 ChromeDriver driver = new ChromeDriver();
 		driver.get("https://www.amazon.in");
 		driver.manage().window().maximize();
 		Thread.sleep(3000);

         WebElement a = driver.findElement(By.xpath("//div[@id='icp-nav-flyout']"));
         
         Actions a1 = new Actions(driver);
         a1.moveToElement(a);
         
         Thread.sleep(3000);
         
         WebElement b = driver.findElement(By.xpath("//div[@id='icp-nav-flyout']"));
         
         
        
         
         //boolean a1 = a.isDisplayed();System.out.println(a1);
	}
}

