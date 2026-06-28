//" WAP to print each URL of all the Links in the given page of a website (google)"
package selenium_Assignments;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment236
{
  public static void main(String[] args) throws InterruptedException 
  {
	  ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	List <WebElement> list =	driver.findElements(By.tagName("a"));
	int count = list.size();
	System.out.println(count);
		
		
}
}
