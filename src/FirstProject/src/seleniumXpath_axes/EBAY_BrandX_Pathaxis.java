package seleniumXpath_axes;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EBAY_BrandX_Pathaxis {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		WebElement searchbox = driver.findElement(By.xpath("//input[@placeholder='Search for anything']"));
		searchbox.sendKeys("mobiles"+Keys.ENTER);
		Thread.sleep(10000);
		
		WebElement brand 
= driver.findElement
(By.xpath("//li[@class='x-refine__main__list']/descendant::span[text()='Samsung']/ancestor::div/span/child::input"));
		brand.click();
		Thread.sleep(10000);
		
		
		//li[@class='x-refine__main__list']/descendant::span/preceding-sibling::span[text()='Samsung']/ancestor::div/preceding-sibling::span
		
		
		WebElement samsung 
= driver.findElement(By.xpath("(//ul[@class='srp-results srp-list clearfix']/li)[1]"));
		samsung.click();
		Thread.sleep(10000);
		
		 Set <String> pcid= driver.getWindowHandles();
		 System.out.println(pcid);
		 Thread.sleep(10000);
		 
		Iterator <String> pc =  pcid.iterator();
		String parentid = pc.next();
		String childid  = pc.next();
		Thread.sleep(15000);
		
		driver.switchTo().window(childid);
		Thread.sleep(10000);
		
		WebElement addtocart = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		addtocart.click();
		Thread.sleep(5000);
		
		
		
	}

}
