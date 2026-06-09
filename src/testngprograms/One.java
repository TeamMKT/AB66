package testngprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class One 
{
	@Test
	public void login()
	{
		ChromeDriver driver=new ChromeDriver();	
		driver.get("https://www.facebook.com/login");
		driver.manage().window().maximize();
	//	WebElement e1=	driver.findElement(By.xpath("//input[@name='email']"));
		WebElement e1=	driver.findElement(By.xpath("//manish[@name='email']"));
		e1.sendKeys("stbymkt@gmail.com");
		
		WebElement e2=	driver.findElement(By.xpath("//input[@name='pass']"));
		e2.sendKeys("manish123"+Keys.ENTER);
		
	}
}
