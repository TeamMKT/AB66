package selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//Write a script to automate give url https://grotechminds.com/payments/
public class Assignment232 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		   driver.get("https://grotechminds.com/payments/");
		     driver.manage().window().maximize();
		     Thread.sleep(3000);
	WebElement e1 = driver.findElement(By.id("cardNumber"));
	e1.sendKeys("123456789");
	WebElement e2 = driver.findElement(By.id("expiryDate"));
	e2.sendKeys("12/2026");
	WebElement e3 = driver.findElement(By.id("cvv"));
	e3.sendKeys("126");
	
	WebElement e4 = driver.findElement(By.id("cardType"));
	Select c1 = new Select (e4);
	c1.selectByContainsVisibleText("Mastercard");
	c1.selectByIndex(2);
	c1.selectByValue("amex"); 
	WebElement e5 = driver.findElement(By.id("amount"));
	e5.sendKeys("12600");
	WebElement e6 = driver.findElement(By.id("currency"));
	e6.sendKeys("INR"+ Keys.ENTER);
	
	
	
	
	
		     Thread.sleep(3000);
	}

}
