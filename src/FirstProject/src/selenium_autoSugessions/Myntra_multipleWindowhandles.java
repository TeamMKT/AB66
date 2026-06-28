package selenium_autoSugessions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Myntra_multipleWindowhandles {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.myntra.com/?utm_source=chatgpt.com");
	     driver.manage().window().maximize();
	     Thread.sleep(3000);
	     
	  WebElement searchbox=driver.findElement(By.xpath(" //input[@placeholder='Search for products, brands and more']"));
	  searchbox.sendKeys("Biba Women" + Keys.ENTER) ;
	  Thread.sleep(3000);
	  
	  List <WebElement> bibaproducts = driver.findElements(By.xpath("//ul[@class='results-base']/li"));
	  for(int i=0;i<5;i++)
	  {
		  WebElement pcid = bibaproducts.get(i);
		  pcid.click();
	  }
	  Set <String> set = driver.getWindowHandles();
	  System.out.println(set);
	  Thread.sleep(3000);
	  
	  List <String> list = new ArrayList <String> (set);
       Iterator <String> pcid = list.iterator();
       String parentid = pcid.next();
       String childid1 = pcid.next();
       String childid2 = pcid.next();
       String childid3 = pcid.next();
       String childid4 = pcid.next();
       String childid5 = pcid.next();
	  
       driver.switchTo().window(childid4);
       Thread.sleep(3000);
       
   WebElement size = driver.findElement(By.xpath("(//span[@class='size-buttons-size-strike-hide']/parent::button)[3]"));
   size.click();
   Thread.sleep(3000);
   
   WebElement addtocart = 
driver.findElement(By.xpath("//span[@class='myntraweb-sprite pdp-whiteBag sprites-whiteBag pdp-flex pdp-center']/parent::div"));
	  addtocart.click();
	  Thread.sleep(3000);
	  
	  WebElement gotocart = 
			  driver.findElement(By.xpath("//span[text()='GO TO BAG']/parent::a"));
			  	  gotocart.click();
	Thread.sleep(3000);
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
			
			
						  	  
	
	  
	
	  

	}

}
