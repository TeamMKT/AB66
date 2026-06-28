package selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra_autosuggessions 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.myntra.com/?utm_source=chatgpt.com");
	     driver.manage().window().maximize();
	     Thread.sleep(3000);
	    
	     WebElement serachbox =driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
	     serachbox.sendKeys("Biba");
	     Thread.sleep(3000);
	     
	     List <WebElement> list =driver.findElements(By.xpath("(//ul[@class='desktop-group']/li)"));
	     int count = list.size();
	     System.out.println(count);
	     WebElement E2 = list.get(count-1);
	     E2.click();
	
     
     
}
}
