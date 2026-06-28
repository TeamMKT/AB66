package seleniumMKT_XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  ChromeDriver driver=new ChromeDriver();	
		driver.get("https://grotechminds.com/registeration-form/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement firstname = driver.findElement(By.id("firstName"));
		firstname.sendKeys("Geeta");
		Thread.sleep(3000);
		Actions a1 = new Actions(driver);
		a1.doubleClick(firstname).perform();
		firstname.sendKeys(Keys.CONTROL+"c");
		WebElement lastname = driver.findElement(By.id("lastName"));
		/*lastname.sendKeys("Meduri");
		Actions a2 = new Actions(driver);
		a2.doubleClick(lastname).perform();*/
		lastname.sendKeys(Keys.CONTROL+"v");
		
		
}
}
