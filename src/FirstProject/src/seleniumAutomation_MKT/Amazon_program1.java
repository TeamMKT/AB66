package seleniumAutomation_MKT;
// Write a programe to laucnh Amazona  and click on mobiles
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_program1 
{
  public static void main(String[] args) throws InterruptedException 
  {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement e1 = driver.findElement(By.linkText("Electronics"));
	e1.click();
	
	
}
}
