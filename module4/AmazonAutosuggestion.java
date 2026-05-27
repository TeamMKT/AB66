package module4;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AmazonAutosuggestion 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();	
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();

		Thread.sleep(3000);
		WebElement searchTextBox=	driver.findElement(By.id("twotabsearchtextbox"));
		searchTextBox.sendKeys("shoes");
		Thread.sleep(3000);
		List<WebElement> list=	driver.findElements(By.xpath("//div[@role='rowgroup']/div/div"));
		int count=	list.size();
		list.get(count-1).click();
		
	}
}
