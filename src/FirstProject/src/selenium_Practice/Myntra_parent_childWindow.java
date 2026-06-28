package selenium_Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra_parent_childWindow 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.myntra.com/?utm_source=chatgpt.com");
	     driver.manage().window().maximize();
	     Thread.sleep(3000);
	     
	     WebElement serachbox =driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
	     serachbox.sendKeys("MamaEarth shampoo"+Keys.ENTER);
	     Thread.sleep(3000);
	     
	   WebElement product =driver.findElement(By.xpath("(//ul[@class='results-base']/li)[1]"));
	   product.click();
	   Thread.sleep(3000);
	   
	   Set<String> pcid = driver.getWindowHandles();
	   System.out.println(pcid);
	    		 
	   Iterator <String> pc = pcid.iterator();
	   String parentid = pc.next();
	   String childid = pc.next();
	   Thread.sleep(4000);
	   
	   driver.switchTo().window(childid);
	  
	driver.findElement(By.xpath(" (//div[@class='size-buttons-buttonContainer'])[1]")).click();
      
	Thread.sleep(5000);
			   
	   driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
	   Thread.sleep(5000);	   
	   
	   
}
}
