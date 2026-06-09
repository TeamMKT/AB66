package module4;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GoogleLinkCount2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();	
		driver.get("https://www.amazon.in");
		driver.manage().window().minimize();
		Thread.sleep(2000);
		List<WebElement> list=	driver.findElements(By.tagName("a"));
		Thread.sleep(2000);
			
			for(int i=0;i<list.size();i++)
			{
					WebElement e2=		list.get(i);
					String text=	e2.getText();
					System.out.println(text);
			}
		
		}
}
