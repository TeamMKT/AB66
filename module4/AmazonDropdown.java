package module4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
public class AmazonDropdown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		EdgeDriver driver=new EdgeDriver();	
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement e1=	driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		//e1.click();
		Select s1=new Select(e1);
	//	s1.selectByIndex(5);
	//	s1.selectByVisibleText("Computers & Accessories");
		s1.selectByValue("search-alias=computers");
	}
}
