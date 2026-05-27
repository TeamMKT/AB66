package module4;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class NaukriChild 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();	
		driver.get("https://www.naukri.com/registration/createAccount?");
		driver.manage().window().maximize();

		Thread.sleep(3000);
		WebElement google=	driver.findElement(By.xpath("//span[text()='Google']"));
		google.click();
		
		Set<String> pcid=	driver.getWindowHandles();
		
		System.out.println(pcid);
		
		Iterator<String>	 p=pcid.iterator();
				String pid=			p.next();
				String cid=			p.next();
		driver.switchTo().window(cid);
		Thread.sleep(3000);

		driver.close();
		
	}
}
