package practice_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		  ChromeDriver driver = new ChromeDriver();
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  driver.manage().window().maximize();
		  Thread.sleep(3000);
		  WebElement e1 = driver.findElement(By.xpath("//input[@name='username']"));
		  e1.sendKeys("Admin");
		  WebElement e2 = driver.findElement(By.xpath("//input[@name='password']"));
		  e2.sendKeys("admin123");
		  WebElement e3 = driver.findElement(By.xpath("//div[@class='oxd-form-actions orangehrm-login-action']"));
		  e3.click();
		  Thread.sleep(3000);
		  WebElement e4 = driver.findElement(By.xpath("//input[@placeholder='oxd-input oxd-input--active']"));
		  e4.sendKeys("Directory");
		  //WebElement e4 = driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']"));

		  WebElement e5 =driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']"));
		  e5.click();
		  Thread.sleep(3000);
		  /*WebElement e6 = driver.findElement(By.xpath("//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']"));
		  e6.sendKeys("paul");
		  Thread.sleep(3000); */
		
		  
		  
		  
		  
		  
	}
 
     
   
   

}
