package selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Blogs_iframe {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement launch = driver.findElement(By.xpath("//div[@id='chat-bot-launcher-button']"));
		launch.click();
		Thread.sleep(3000);
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='chat-bot-iframe']"));
		driver.switchTo().frame(iframe);
		Thread.sleep(3000);
		
		WebElement name = driver.findElement(By.id("textInput"));
		name.sendKeys("rudra"+Keys.ENTER);
		Thread.sleep(3000);
		
		WebElement email = driver.findElement(By.id("textInput"));
		email.sendKeys("grps@gmail.com"+Keys.ENTER);
		Thread.sleep(3000);
		
		WebElement mobile = driver.findElement(By.id("textInput"));
		mobile.sendKeys("8500242826"+Keys.ENTER);
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		
	   WebElement blogs = driver.findElement(By.xpath("(//ul[@id='menu-1-10edec5']/li)[3]"));
				
	   blogs.click();
	   Thread.sleep(3000);
	   
	   WebElement launch1 = driver.findElement(By.xpath("//div[@id='chat-bot-launcher-button']"));
		launch1.click();
		Thread.sleep(3000);
		
		WebElement iframe1 = driver.findElement(By.xpath("//iframe[@id='chat-bot-iframe']"));
		driver.switchTo().frame(iframe1);
		Thread.sleep(3000);
		
		WebElement course = driver.findElement(By.xpath("//div[text()='Software Automation Testing']"));
		course.click();
		Thread.sleep(3000);
		
		WebElement submit = driver.findElement(By.xpath("//div[text()='Confirm']"));
		submit.click();
		Thread.sleep(5000);
		
	   
	   
		
		
		
		
		
		
		
	    
		
		
		

	}

}
