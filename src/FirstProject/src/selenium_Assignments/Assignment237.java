package selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment237 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		   driver.get("https://grotechminds.com/payments/");
		     driver.manage().window().maximize();
		     Thread.sleep(3000);
		 	WebElement e1 = driver.findElement(By.id("cardNumber"));
		 	boolean b1 = e1.isDisplayed();
		 	boolean b2 = e1.isEnabled();
		 	System.out.println("is dispalyed:" + b1);
		 	System.out.println("is enabled:" + b2);
		 	if(b1 && b2)
		 	{
		 		e1.sendKeys("123456789");
		 	}
		 	else
		 	{
		 		System.out.println("can't perform action since it is not dipalyes and enabled");
		 	}
	}

}
