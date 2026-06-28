package selenium_Assignments;
//" Write a script to hoverover the web Element by using Actions class "
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment244 
{
	public static void main(String[] args) throws InterruptedException
	   {
		   ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			WebElement fresh=	driver.findElement(By.xpath("//span[text()='Fresh']"));
			
			Actions a1 = new Actions(driver);
			a1.moveToElement(fresh).perform();
			
			Thread.sleep(3000);
			WebElement e1 = driver.findElement(By.xpath("//img[@alt='Amazon Now']"));
			e1.click();
			WebElement e2 = driver.findElement(By.xpath("//input[@name='email']"));
			e2.sendKeys("8500448418"+Keys.ENTER);
			
			WebElement e3 = driver.findElement(By.xpath("//img[@alt='Amazon Fresh']"));
			e3.click();
			
}
}
