package selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class IndiGo_Flights {
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
    	driver.get("https://www.goindigo.in/?cid=Display|Affiliate|MCSP|Digisoftnexus{web}|53_");
    	driver.manage().window().maximize();
    	Thread.sleep(3000);
    	
    	WebElement cookies= driver.findElement(By.xpath("//button[@aria-label='accept cookies'][2]"));
    	cookies.click();
    	Thread.sleep(3000);
      
    	WebElement flights = driver.findElement(By.xpath("//div[text()='Flights']"));
    	flights.click();
    	Thread.sleep(3000);
    	
    

	}

}
