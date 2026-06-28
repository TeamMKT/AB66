/*WAP to search  a product and click on the first 5 products after that move the 
control to 3rd one*/
package selenium_Assignments;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment248 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();	
		driver.get("https://ebay.com");
		driver.manage().window().maximize();
	     Thread.sleep(3000);
	     
			WebElement searchproduct = driver.findElement(By.xpath("//input[@id='gh-ac']"));
			searchproduct.sendKeys("womens tops"+Keys.ENTER);
			
			Thread.sleep(3000);
			
		 List <WebElement >womenstops =	driver.findElements(By.xpath("//ul[@class='srp-results srp-grid clearfix']/li"));
		  
	      for(int i=0;i<5;i++)
	      {
	    	 WebElement pcid = womenstops.get(i);
	    	 pcid.click();
	      }
	      
		Thread.sleep(3000);
		       Set <String> set = driver.getWindowHandles();
		       System.out.println(set);
		       
		       Thread.sleep(3000);
		       
		       List <String> list = new ArrayList <String> (set);
		      Iterator <String> pcid = list.iterator();
		         String parentid =  pcid.next();
		         String childtid1 =  pcid.next();
		         String childtid2 =  pcid.next();
		         String childtid3 =  pcid.next();
		         String childtid4 =  pcid.next();
		         String childtid5 =  pcid.next();
		         
		    driver.switchTo().window(childtid3);
	           Thread.sleep(3000);
	
	
	
	
	 
	 
	    		 

	}

}
