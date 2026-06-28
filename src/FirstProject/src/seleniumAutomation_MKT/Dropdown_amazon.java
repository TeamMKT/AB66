package seleniumAutomation_MKT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_amazon 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		WebElement E1 = driver.findElement(By.id("searchDropdownBox"));
		Select a1 = new Select (E1);
		//a1.selectByVisibleText("Baby");(This is not working for me)
		a1.selectByIndex(10);
		a1.selectByValue("search-alias=baby");//these two are working.
		
		
		

	}
}
