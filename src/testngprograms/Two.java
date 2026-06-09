package testngprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Two 
{
	@Test
	public void Logout() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();	
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	
		/*Options o1=	driver.manage();
		Window w1=	o1.window();
		w1.maximize();*/
		Thread.sleep(3000);
		WebElement mobile=	driver.findElement(By.linkText("Mobiles"));
		mobile.click();
	}
}
