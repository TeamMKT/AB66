package seleniumXpath_axes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra_XPath_axes_brandName {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
    	driver.get("https://www.myntra.com");
    	driver.manage().window().maximize();
    	Thread.sleep(3000);
    	 
    	WebElement serachbox =driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
	     serachbox.sendKeys("kurthi"+Keys.ENTER);
	     Thread.sleep(10000);
	     
	    /* WebElement brandselect 
	    =driver.findElement(By.xpath("//div[@class='vertical-filters-filters brand-container']/descendant::div[@class='common-checkboxIndicator']/preceding-sibling::span[@class='brand-num']/parent::label[text()='Anouk Rustic']"));
	    brandselect.click();
	     Thread.sleep(3000);*/
	   
	   //div[@class='vertical-filters-filters brand-container']/descendant::div[@class='common-checkboxIndicator']/preceding-sibling::span[@class='brand-num']/parent::label[text()='Anouk Rustic']
	
	     WebElement brandselect 
 =driver.findElement(By.xpath("//div[@class='vertical-filters-filters brand-container']/descendant::label[text()='HERE&NOW']/child::span/following-sibling::div"));
	     brandselect.click();
	     Thread.sleep(3000);
	
	
	
	}
	
	
	
	

}
