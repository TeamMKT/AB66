package seleniumXpath_axes;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Payment 
{
 public static void main(String[] args) throws InterruptedException 
 {
	 ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("handbag"+Keys.ENTER);
		Thread.sleep(3000);
		WebElement handbag = driver.findElement(By.xpath("(//img[@class='s-image']/parent::div)[1]"));
		handbag.click();
		
		Set <String> pcid = driver.getWindowHandles();
		System.out.println(pcid);
		
		 Iterator <String> pc = pcid.iterator();
		String parent = pc.next();
		String child= pc.next();
		driver.switchTo().window(child);
		Thread.sleep(3000);
		
		WebElement addtocart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		addtocart.click();
	
		//(//span[text()='Add to cart']/parent::span)[2]
		WebElement gotocart = driver.findElement(By.xpath("//span[@id='sw-gtc']"));
		gotocart.click();
		
		WebElement proceedtobuy = driver.findElement(By.xpath("//input[@value='Proceed to checkout']"));
		proceedtobuy.click();
		Thread.sleep(3000);
		
		WebElement signin = driver.findElement(By.xpath("//input[@type='email']"));
		  signin.sendKeys("8500448418"+Keys.ENTER);
		  Thread.sleep(3000);
		  
		  WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		 password.sendKeys("Grps@2007"+Keys.ENTER);
		  Thread.sleep(3000);
		  
		  WebElement payment 
= driver.findElement(By.xpath("//div[@id='checkout-paymentOptionPanel']/descendant::span[text()='Cash on Delivery/Pay on Delivery']/parent::span/parent::label/input\r\n"
		+ ""));
			 
			  
	WebElement paymentmethod = driver.findElement(By.xpath("//span[@id='checkout-secondary-continue-button-id']"));
	paymentmethod.click();
		
		
		
		
}
}
