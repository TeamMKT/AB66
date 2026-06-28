package selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//"https://www.bseindia.com/markets/equity/equitysensexstream; What is the security code of BAJFINANCE"
public class Assignment262 {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.bseindia.com/markets/equity/equitysensexstream");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//tbody/tr/descendant::b[text()=' BAJFINANCE ']/ancestor::td/preceding-sibling::td[text()='500034']
		WebElement E1 =
		 driver.findElement(By.xpath("//tbody/tr/descendant::b[text()=' BAJFINANCE ']/ancestor::td/preceding-sibling::td"));
		String text= E1.getText();
		System.out.println(text);
		Thread.sleep(3000);
		
	}

}
