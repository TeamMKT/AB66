package seleniumAutomation_MKT;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch
{
   public static void main(String[] args) throws InterruptedException 
   {
	  ChromeDriver driver = new ChromeDriver();
	  driver.get("https://www.amazon.in");
	  Thread.sleep(3000);
	  driver.manage().window().maximize();
	    /*WebElement searchTextBox = driver.findElement(By.id("twotabsearchtextbox"));
	    searchTextBox.sendKeys("shoes");*/
	  WebElement W1=driver.findElement(By.id("twotabsearchtextbox"));
	    W1.sendKeys("Samsung Mobiles");
	    WebElement searchingProduct = driver.findElement(By.id("nav-search-submit-button"));
	    searchingProduct.click();
	    
	    
	  
}
}
