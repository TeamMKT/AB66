package module4;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GoogleLinkCount 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();	
		driver.get("https://www.google.in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		List<WebElement> list=	driver.findElements(By.tagName("a"));
		Thread.sleep(2000);
		WebElement e1=	list.get(0);
		String s1=		e1.getText();
		System.out.println(s1);
		e1.click();
		}
}
