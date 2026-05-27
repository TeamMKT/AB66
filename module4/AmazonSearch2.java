package module4;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AmazonSearch2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();	
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	
		/*Options o1=	driver.manage();
		Window w1=	o1.window();
		w1.maximize();*/
		Thread.sleep(3000);
		WebElement searchTextBox=	driver.findElement(By.id("twotabsearchtextbox"));
		searchTextBox.sendKeys("shoes");
		searchTextBox.sendKeys(Keys.ENTER);
		
		/*
		 * alpha-yes
		 * numeric-yes
		 * special-yes
		 * capslock-no
		 * control button
		 * shift
		 * backspace'='enter
		 */
	
	}
}
