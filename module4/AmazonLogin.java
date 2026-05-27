package module4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class AmazonLogin 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("headless");
		
		ChromeDriver driver=new ChromeDriver(options);	
		driver.get("https://www.amazon.in/ap/signin?openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
	WebElement e1=	driver.findElement(By.xpath("//input[@name='email']"));
	e1.sendKeys("stbymkt@gmail.com");
	
	WebElement e2=	driver.findElement(By.xpath("//span[@id='continue']"));
	e2.click();
	Thread.sleep(3000);
	WebElement e3=	driver.findElement(By.xpath("//input[@type='password']"));
	e3.sendKeys("mnidh12345");
	Thread.sleep(3000);

	WebElement e4=	driver.findElement(By.xpath("//input[@type='submit']"));
	e4.click();
	}
}
