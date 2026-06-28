package seleniumAutomation_MKT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Program3 
{
   public static void main(String[] args) throws InterruptedException 
   {
	   EdgeDriver driver = new EdgeDriver();
	   driver.get("https://grotechminds.com/registeration-form/");
	   driver.manage().window().maximize();
	   Thread.sleep(2000);
	    WebElement w1 =    driver.findElement(By.id("firstName"));
	    w1.sendKeys("Rudra");
}
}
