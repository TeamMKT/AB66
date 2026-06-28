package seleniumXpath_axes;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Amazon_Xpath_axes
{
    public static void main(String[] args) throws InterruptedException
    {
    	ChromeDriver driver = new ChromeDriver();
    	driver.get("https://www.amazon.in");
    	driver.manage().window().maximize();
    	Thread.sleep(3000);
    	WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
    	e1.sendKeys("books for 3 years old");
    	Thread.sleep(3000);
    	/*List <WebElement> list = driver.findElements(By.xpath("((//div[@role='rowgroup']/div/child::div)[10]/preceding-sibling::div)[1]"));
    	int count  = list.size();
    	System.out.println(count);*/
    	
    	
    			
   List <WebElement> list = driver.findElements(By.xpath("((//div[@role='rowgroup']/div/child::div)[10]/preceding-sibling::div)[5]"));
   int count  = list.size();
   System.out.println(count);
    	
    	
    	

	}
}