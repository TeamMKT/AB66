package module4;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GoogleAutosuggestion 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();	
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement e1=	driver.findElement(By.id("APjFqb"));
		e1.sendKeys("India Country");
		Thread.sleep(5000);
		
		List<WebElement> list=	driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		int count=	list.size();
		System.out.println(count);
		
		
		list.get(count-1).click();
	}
}
