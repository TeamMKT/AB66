package seleniumAutomation_MKT;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class JSAMTagname 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();	
		driver.get("file:///C:/Users/geeta/Downloads/learningHTML1.html");
		driver.manage().window().maximize();
		WebElement e1=	driver.findElement(By.id("1"));
		e1.sendKeys("Geeta");
		WebElement e2 = driver.findElement(By.id("2"));
		e2.sendKeys("grotechminds");
		WebElement e3 = driver.findElement(By.id("3"));
		e3.sendKeys("Rudra@123");
		WebElement e4 = driver.findElement(By.name("fname"));
		e4.sendKeys("Geeta");
		
		
	
	}
}

