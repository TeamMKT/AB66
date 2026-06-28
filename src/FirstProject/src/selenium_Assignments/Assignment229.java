package selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Write a programe to laucnh Amazona  and click on mobiles
public class Assignment229 
{
   public static void main(String[] args) throws InterruptedException 
   {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	WebElement a = driver.findElement(By.linkText("Mobiles"));
	a.click();
	
	
}
}
