package seleniumAutomation_MKT;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class JSAMENABLED 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();	
		driver.get("file:///C:/Users/geeta/Downloads/learningHTML1.html");
		driver.manage().window().maximize();
		WebElement e1=	driver.findElement(By.id("1"));
		
		if(e1.isDisplayed() && e1.isEnabled())
		{
			e1.sendKeys("Geeta");
		}
		
		else
		{
			System.out.println("can't perform action since is not Dispalyed or Enabled");
		}
       WebElement e2=	driver.findElement(By.id("121"));
		
		if(e2.isDisplayed() && e2.isEnabled())
		{
			e1.sendKeys("Geeta");
		}
		
		else
		{
			System.out.println("can't perform action since is not Dispalyed or Enabled");
		}

	
	}
}

