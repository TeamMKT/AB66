package selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//"navigate this url ""https://www.facebook.com/login by using name loacter automate the fields "
public class Assignment227 
{
public static void main(String[] args) throws InterruptedException 
{
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/login");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement a = driver.findElement(By.name("email"));
	a.sendKeys("geeta.meduri@gmail.com");
	WebElement b = driver.findElement(By.name("pass"));
	b.sendKeys("Grps@2007");
	b.sendKeys(Keys.ENTER);
	
	
	
	
	
}
}
