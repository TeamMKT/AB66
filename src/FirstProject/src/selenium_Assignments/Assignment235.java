package selenium_Assignments;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*"WAP to search a product and count the number  product Pharmacy application(any one ); 
tata1MG; apollo; medicart;etc*/
public class Assignment235 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  ChromeDriver driver= new ChromeDriver();
	   driver.get("https://medikart.co.in/");
	     driver.manage().window().maximize();
	     Thread.sleep(3000);
	 WebElement E1 = driver.findElement(By.name("s"));
	 E1.sendKeys("CPAP Machines"+Keys.ENTER);
	 Thread.sleep(3000);
	 List <WebElement> list =driver.findElements(By.xpath("//a[@class='wd-product-img-link product-image-link']"));
	// List <WebElement> list =driver.findElements(By.className("wd-product-img-link product-image-link"));(not working by class name directly)
	    int count = list.size();
	    
	    System.out.println("Name of the product is CPAP Machines:" + count);
	    
	 
	 
	  
	    
	    
	     
	     
	     
}
}
