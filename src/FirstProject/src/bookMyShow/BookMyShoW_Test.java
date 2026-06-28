package bookMyShow;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BookMyShoW_Test 
{
	@Test
	public void TestScenario() throws InterruptedException
	{
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://in.bookmyshow.com/e");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	WebElement selectcity = driver.findElement(By.xpath("//input[@inputmode='text']"));
	selectcity.sendKeys("Vizag"+Keys.ENTER);
	Thread.sleep(3000);
	
	WebElement direction = driver.findElement(By.xpath("//div[@class='sc-5d56x9-2 gJnqzY']"));
	direction.click();
	Thread.sleep(3000);
	
	
	WebElement searchforamovie = driver.findElement(By.xpath("//span[@class='sc-1or3vea-15 bMabGE']"));
	searchforamovie.click();
	Thread.sleep(4000);
	
	WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
	search.sendKeys("Maa Inti bangaram"+Keys.ENTER);
	Thread.sleep(4000);
	
	WebElement booktickets = driver.findElement(By.xpath("//button[@data-phase='postRelease']"));
	//"(//span[text()='Book tickets'])[1]"));
   booktickets.click();
    Thread.sleep(4000);
    
    WebElement signin = driver.findElement(By.xpath("//button[@aria-label='Sign in']"));
	signin.click();
	Thread.sleep(4000);
	
	WebElement cntegle = driver.findElement(By.xpath("(//div[@class='sc-z1ldnh-5 hwrHAr'])[1]"));
	cntegle.click();
	Thread.sleep(3000);
	
	
    
    
	
	
}
}
