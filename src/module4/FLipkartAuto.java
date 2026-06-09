package module4;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FLipkartAuto 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();	
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	
	Thread.sleep(2000);
	WebElement E2=	driver.findElement(By.xpath("//span[text()='✕']"));

	E2.click();
	Thread.sleep(2000);
	WebElement e1=	driver.findElement(By.name("q"));

	e1.sendKeys("Toys");
	Thread.sleep(2000);
	List<WebElement> list=	driver.findElements(By.xpath("//form/ul/li"));
	int count=	list.size();
	Thread.sleep(2000);
	list.get(count-1).click();
	
	}
}
