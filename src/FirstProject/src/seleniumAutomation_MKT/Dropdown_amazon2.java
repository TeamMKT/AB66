package seleniumAutomation_MKT;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Dropdown_amazon2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		WebElement E1 = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		E1.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		E1.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		
		

	}
}
