package seleniumXpath_axes;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_XPath_axes_Brandname {

	public static void main(String[] args) throws InterruptedException {
		 ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
			e1.sendKeys("shoes"+Keys.ENTER);
			Thread.sleep(3000);
			WebElement shoes = driver.findElement(By.xpath("//div[@id='brandsRefinements']/descendant::span[text()='Campus']/preceding-sibling::div/label/i"));
			shoes.click();
			Thread.sleep(3000);
			
			WebElement campusBrand = driver.findElement(By.xpath("(//div[@role='listitem'])[1]"));
			campusBrand.click();
			Thread.sleep(3000);
			
			Set <String> pcid = driver.getWindowHandles();
			
			Iterator <String> pc = pcid.iterator();
			
			String parentid = pc.next();
			String childid = pc.next();
			
			driver.switchTo().window(childid);
			Thread.sleep(3000);
			
			WebElement addtocart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
			addtocart.click();
			Thread.sleep(3000);
			
			WebElement proceedtobuy = driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']"));
			proceedtobuy.click();
			Thread.sleep(3000);
			
			WebElement signin = driver.findElement(By.xpath("//input[@type='email']"));
			signin.sendKeys("8500448418"+Keys.ENTER);
			Thread.sleep(3000);
			
			WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
			password.sendKeys("Grps@2007"+Keys.ENTER);
			Thread.sleep(3000);
			
			WebElement paymentoption = driver.findElement
(By.xpath("//div[@id='checkout-paymentOptionPanel']/descendant::span[text()='ICICI Bank Credit Card']/ancestor::div/preceding-sibling::div/descendant::label/input"));
			paymentoption.sendKeys("374740928177004" +Keys.ENTER);	
			Thread.sleep(3000);
			
			
			//div[@id='checkout-paymentOptionPanel']/descendant::span[text()='ICICI Bank Credit Card']/parent::span/ancestor::div/preceding-sibling::div/descendant::label/input	
			

	}

}
//div[@id='brandsRefinements']/descendant::span[text()='Campus']/preceding-sibling::div/child::label/i