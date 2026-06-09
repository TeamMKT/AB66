package module4;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
public class AmazonDropdown2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		EdgeDriver driver=new EdgeDriver();	
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement e1=	driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		e1.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		e1.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		e1.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		e1.sendKeys(Keys.ARROW_DOWN);

			
		
	}
}
