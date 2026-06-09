package testngprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Three 
{
	@Test
	public void Logout() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();	
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	
	WebElement E2=	driver.findElement(By.linkText("Gmail"));

	Actions a1=new Actions(driver);
	a1.contextClick(E2).perform();
	}
}
