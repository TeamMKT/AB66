//Write a script Login to facebook with Xpath
package selenium_Assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment239 
{
  public static void main(String[] args) throws InterruptedException
  {
	  ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("geeta.meduri@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
		password.sendKeys("Grps@2007"+ Keys.ENTER);
		
		driver.close();
		
		
		
}
}
