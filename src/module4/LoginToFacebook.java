package module4;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginToFacebook 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();	
		driver.get("https://www.facebook.com/login");
		driver.manage().window().maximize();
		WebElement e1=	driver.findElement(By.name("email"));
		e1.sendKeys("stbymkt@gmail.com");
		
		WebElement e2=	driver.findElement(By.name("pass"));
		e2.sendKeys("manish123"+Keys.ENTER);
	}
}
