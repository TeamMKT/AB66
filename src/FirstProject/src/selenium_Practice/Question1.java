/* On the below website, https://www.ebay.com/, Search any product and click on 1st one.Click on Add to cart, 
Click on Checkout 1 Item, Click on Continue with Google[That's it]*/

package selenium_Practice;
 import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Question1 
{
   public static void main(String[] args) throws InterruptedException 
   {
	  ChromeDriver driver = new ChromeDriver();
	  driver.get("https://www.ebay.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  
	  WebElement searchproduct = driver.findElement(By.id("gh-ac"));
	  searchproduct.sendKeys("HandBag"+Keys.ENTER);
	  Thread.sleep(3000);
	 
	WebElement handbag = driver.findElement(By.xpath("(//ul[@class='srp-results srp-grid clearfix']/li)[10]"));	
	handbag.click();
	Thread.sleep(3000);
	
	Set<String> pcid = driver.getWindowHandles();
	   System.out.println(pcid);
	    		 
	   Iterator <String> pc = pcid.iterator();
	   String parentid = pc.next();
	   String childid = pc.next();
	   Thread.sleep(4000);
	   
	   driver.switchTo().window(childid);
	
	 WebElement addtocart =   driver.findElement(By.xpath("//a[@id='atcBtn_btn_1']"));
	 addtocart.click();
	Thread.sleep(3000);
	
	WebElement gotocheckout =   driver.findElement(By.xpath("//span[text()='Checkout 1 item']"));
	 gotocheckout.click();
	 Thread.sleep(3000);
	 
	 WebElement signin =   driver.findElement(By.xpath("//input[@id='userid']"));
	 signin.sendKeys("geeta.meduri@gmail.com"+Keys.ENTER);
	 Thread.sleep(3000);
	 
	 WebElement password =   driver.findElement(By.xpath("//input[@id='pass']"));
	 password.sendKeys("Grps@2007"+Keys.ENTER);
	 Thread.sleep(3000);
	 
	 
	 
	   
}
}
