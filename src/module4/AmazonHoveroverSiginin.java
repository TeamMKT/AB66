package module4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class AmazonHoveroverSiginin 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();	
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	
		Thread.sleep(3000);
		WebElement signin=	driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
	
	Actions a1=new Actions(driver);
	a1.moveToElement(signin).perform();
	Thread.sleep(3000);
	
	WebElement e1=	driver.findElement(By.xpath("//a[@class='nav-action-signin-button']"));
e1.click();

	}
}
