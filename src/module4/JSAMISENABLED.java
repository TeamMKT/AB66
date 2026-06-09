package module4;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class JSAMISENABLED 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();	
		driver.get("file:///C:/Users/MKT/Desktop/learningHTML1.html");
		driver.manage().window().maximize();
		WebElement e1=	driver.findElement(By.id("1"));
		if(e1.isDisplayed() && e1.isEnabled())
		{
		e1.sendKeys("manish1710");
		}
		else
		{
			System.out.println("Cant perfrom action since is not displayed or Enabled");
		}
		WebElement e2=	driver.findElement(By.id("121"));
		if(e2.isDisplayed() && e2.isEnabled())
		{
		e2.sendKeys("Sharma");
		}
		else
		{
			System.out.println("Cant perfrom action since is not displayed or Enabled");
		}
		
		WebElement baby=	driver.findElement(By.id("321"));
		if(baby.isSelected())
		{
			System.out.println("");
		}
		else
		{
			
			baby.click();
		}
	
	}
}
