package seleniumAutomation_MKT;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class JSAMENABLED3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();	
		driver.get("file:///C:/Users/geeta/Downloads/learningHTML1.html");
		driver.manage().window().maximize();
		WebElement boy=	driver.findElement(By.id("123"));
		if(boy.isSelected())
		{
			System.out.println("");
		}
		else
		{
			boy.click();
		}
		
		
	
	}
}

