package seleniumXpath_axes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart_X_path_axes {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement Login = driver.findElement(By.xpath("//span[text()='✕']"));
		Login.click();
		Thread.sleep(3000);
		
		WebElement e2 = driver.findElement(By.name("q"));
		e2.sendKeys("shoes"+Keys.ENTER);
		Thread.sleep(3000);
		
		WebElement nikebrand
		= driver.findElement(By.xpath("//section[@class='KNnSWQ vRd1kF']/child::div[@class='kMXMaw']/descendant::div[text()='NIKE']/preceding-sibling::div"));
		nikebrand.click();
		Thread.sleep(3000);
		
		
		
		
		

	}

}
