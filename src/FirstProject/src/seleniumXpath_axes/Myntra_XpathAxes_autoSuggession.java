package seleniumXpath_axes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra_XpathAxes_autoSuggession {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
    	driver.get("https://www.myntra.com");
    	driver.manage().window().maximize();
    	Thread.sleep(3000);
    	 WebElement serachbox =driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
	     serachbox.sendKeys("Biba");
	     Thread.sleep(3000);
    	/*List <WebElement> list = driver.findElements(By.xpath("((//ul[@class='desktop-group']/child::li)[11]/preceding-sibling::li)[1]"));
    	int count  = list.size();
    	System.out.println(count);*/
	     List <WebElement> list = driver.findElements(By.xpath("((//ul[@class='desktop-group']/child::li)[5]/following-sibling::li)[6]"));
	    	int count  = list.size();
	    	System.out.println(count);
	    


	}

}
