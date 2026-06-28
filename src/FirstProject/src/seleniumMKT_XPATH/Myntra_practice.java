package seleniumMKT_XPATH;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra_practice {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		
		WebElement E1 = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
		E1.sendKeys("handbags"+Keys.ENTER);
		Thread.sleep(6000);
		
		WebElement E2
		= driver.findElement(By.xpath("//div[@class='vertical-filters-filters brand-container']/descendant::label[text()='CORSICA']/child::span/following-sibling::div"));
		E2.click();
		Thread.sleep(3000);
				
		WebElement handbag = driver.findElement(By.xpath("(//ul[@class='results-base']/li)[1]"));
		handbag.click();
		Thread.sleep(3000);
		
		Set <String> handbags = driver.getWindowHandles();
		System.out.println(handbags);
		
		  Iterator <String> pcid =   handbags.iterator();
		 String parentid=  pcid.next();
		 String childid = pcid.next();
		 
		 driver.switchTo().window(childid);
		 Thread.sleep(3000);
		 
		 WebElement size = driver.findElement(By.xpath("//div[@class='size-buttons-buttonContainer']"));
		 size.click();
		 Thread.sleep(3000);
		 
		//span[@class='myntraweb-sprite pdp-whiteBag sprites-whiteBag pdp-flex pdp-center']/parent::div
		 
		 WebElement addtocart = 
				 driver.findElement(By.xpath("//span[@class='myntraweb-sprite pdp-whiteBag sprites-whiteBag pdp-flex pdp-center']/parent::div"));
				 	  addtocart.click();
				 	  Thread.sleep(3000);
				 	  
				 	//span[text()='GO TO BAG']/parent::a
		WebElement gotocart = 
		driver.findElement(By.xpath("//span[text()='GO TO BAG']/parent::a"));
			gotocart.click();
					Thread.sleep(3000);
					//div[text()='PLACE ORDER']/parent::button
					
	 WebElement placeorder = driver.findElement(By.xpath("//div[text()='PLACE ORDER']"));
					placeorder.click();
					Thread.sleep(3000);
	
		WebElement login = driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
		login.sendKeys("8500448418");
		Thread.sleep(3000);		
					
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		checkbox.click();
		Thread.sleep(3000);
					
		driver.findElement(By.xpath("//div[text()='CONTINUE']")).click();
					Thread.sleep(3000);
					//div[text()='continue']
		 
		  
		
		
		
		
	}

}
