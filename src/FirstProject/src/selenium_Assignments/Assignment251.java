/*"Assignment for Iframe:Amazon:Searching->Add it to Cart->go to the payment sheet->Credit card option
 [Almost impossibe 4 u]->Enter the Card details[Present inside an Iframe]" */
package selenium_Assignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment251 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();	
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	     Thread.sleep(3000);
	     
		WebElement searchTextBox = driver.findElement(By.id("twotabsearchtextbox"));
	     searchTextBox.sendKeys("HandBag" + Keys.ENTER);
	     Thread.sleep(3000);
	     
	    WebElement Handbag = driver.findElement(By.xpath("//span[@class='rush-component s-latency-cf-section']/div/div[3]"));
	 Handbag.click();
	    Thread.sleep(3000); 
	    
	    Set <String> pcid = driver.getWindowHandles();
	    System.out.println(pcid);
	    
	   Iterator <String> pc = pcid.iterator();
	   String parentid = pc.next();
	   String childid = pc.next();
	   
	   driver.switchTo().window(childid);
	   Thread.sleep(3000);
	   
	   WebElement addtocart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
	    addtocart.click();
	    Thread.sleep(3000);
	    
	  WebElement proceedtobuy = driver.findElement(By.xpath("//span[@id='sc-buy-box-ptc-button']"));
	  proceedtobuy.click();
	  Thread.sleep(3000);
	  
	
	  WebElement signin = driver.findElement(By.xpath("//input[@type='email']"));
	  signin.sendKeys("8500448418"+Keys.ENTER);
	  Thread.sleep(3000);
	  
	  WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
	 password.sendKeys("Grps@2007"+Keys.ENTER);
	  Thread.sleep(3000);
	  
	  WebElement Creditcard = driver.findElement(By.xpath("//input[@id='pp-AOX7Bf-133']"));
	  Creditcard.click();
	  Thread.sleep(3000);
	    
	    
	    
	    

}
}
