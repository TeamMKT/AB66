package module4;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class GoogleLinkURLprint 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("start-maximized");
		ChromeDriver driver=new ChromeDriver(options);	
		driver.get("https://www.google.in");
		Thread.sleep(2000);
		List<WebElement> list=	driver.findElements(By.tagName("a"));
		Thread.sleep(2000);
		for(int i=0;i<list.size();i++)
		{
		WebElement e1=	list.get(i);
	//	String s1=		e1.getText();
		String url=			e1.getDomAttribute("href");
	//	System.out.println(s1);
		System.out.println(url);
		}
	}
}
