package module4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class AmazonHoverover 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();	
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	
		Thread.sleep(3000);
		WebElement fresh=	driver.findElement(By.xpath("//span[text()='Fresh']"));
	
	Actions a1=new Actions(driver);
	a1.moveToElement(fresh).perform();
	Thread.sleep(3000);
	
	WebElement e1=	driver.findElement(By.xpath("//img[@alt='Amazon Fresh']"));
e1.click();

	}
}
