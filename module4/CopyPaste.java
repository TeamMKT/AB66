package module4;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class CopyPaste 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();	
		driver.get("https://grotechminds.com/registeration-form/");
		driver.manage().window().maximize();
	
	WebElement firstName=	driver.findElement(By.id("firstName"));
	firstName.sendKeys("Manish");
	Thread.sleep(3000);
	firstName.sendKeys(Keys.CONTROL+"a");
	firstName.sendKeys(Keys.CONTROL+"C");

	
	WebElement lastname=	driver.findElement(By.id("lastName"));
	lastname.sendKeys(Keys.CONTROL+"V");
	
	}
}
