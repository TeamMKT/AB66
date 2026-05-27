package module4;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class GoogleSearchLanguage 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("lang=ar");
		ChromeDriver driver=new ChromeDriver(options);	
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement e1=	driver.findElement(By.id("APjFqb"));
		e1.sendKeys("India Country");
		
	
	}
}
