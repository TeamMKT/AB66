package module4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AmazonSearch3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();	
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();

		Thread.sleep(3000);
		WebElement l1=	driver.findElement(By.partialLinkText("Service"));
			l1.click();
	}
}
