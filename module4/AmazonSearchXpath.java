package module4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AmazonSearchXpath 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();	
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement searchTextBox=	driver.findElement(By.xpath("(//input)[5]"));
		searchTextBox.sendKeys("shoes");
		WebElement searchingProduct=	driver.findElement(By.id("nav-search-submit-button"));
		searchingProduct.click();
	//	Customer Service
	}
}
