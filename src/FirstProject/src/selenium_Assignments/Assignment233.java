package selenium_Assignments;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Write a script automate webelement using findElements.
public class Assignment233 
{
 public static void main(String[] args) throws InterruptedException 
 {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement E1 = driver.findElement(By.id("twotabsearchtextbox"));
	E1.sendKeys("Toys");
	WebElement E2 = driver.findElement(By.id("nav-search-submit-button"));
	E2.click();
	List <WebElement> list = driver.findElements(By.className("s-image"));
	  int count = list.size();
	  System.out.println(count);
	
	
}
}
