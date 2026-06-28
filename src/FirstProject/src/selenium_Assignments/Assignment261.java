package selenium_Assignments;
import java.util.List;

import org.openqa.selenium.By;
//"https://groww.in/indices/sp-bse-sensex; List down every company who are in the sector of Banks"
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment261
{
	public static void main(String[] args) throws InterruptedException 
	  {
		WebDriver driver = new ChromeDriver();
		driver.get("https://groww.in/indices/sp-bse-sensex");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//table[@class='tb10Table borderPrimary']/descendant::tr/child::th[text()='Sector']
		
		//tbody/tr/td[text()='Banks']/preceding-sibling::td/descendant::div[@class='contentPrimary bodyLargeHeavy companyName_name__EYFI0 truncate']
		//tbody/tr/td[text()='Banks']/preceding-sibling::td/a/div[@class='contentPrimary bodyLargeHeavy companyName_name__EYFI0 truncate']
		
		//tbody/tr/td[text()='Banks']/preceding-sibling::td[@class='tb10Td']
		
		List <WebElement> list = driver.findElements
		(By.xpath("//tbody/tr/td[text()='Banks']/preceding-sibling::td/a/div[@class='contentPrimary bodyLargeHeavy companyName_name__EYFI0 truncate']"));
		int count  = list.size();
		System.out.println(count);
		Thread.sleep(3000);
		
		for(int i=0; i<3;i++)
		{
			WebElement banks = list.get(i);
			String text = banks.getText();
			System.out.println("name of the banks:"+ text);
		}
}
}

