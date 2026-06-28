package selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame_Grotechminds 
{
  public static void main(String[] args) throws InterruptedException 
  {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://grotechminds.com/");
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
	
	WebElement chatbot = driver.findElement(By.id("chat-bot-launcher"));
	//WebElement chatbot = driver.findElement(By.xpath("//div[@id='chat-bot-launcher']"));
	chatbot.click();
	
	Thread.sleep(3000);
	
	WebElement iframe = driver.findElement(By.id("chat-bot-iframe"));
	//WebElement iframe = driver.findElement(By.xpath("//iframe[@id='chat-bot-iframe']"));
	
	 driver.switchTo().frame(iframe);
	 Thread.sleep(3000);
	
	 WebElement name = driver.findElement(By.id("textInput"));
	//WebElement name = driver.findElement(By.xpath("//textarea[@id='textInput']"));
	 name.sendKeys("Rudra"+Keys.ENTER);
	 
	 Thread.sleep(3000);
	 WebElement email = driver.findElement(By.id("textInput"));
		//WebElement name = driver.findElement(By.xpath("//textarea[@id='textInput']"));
		 email.sendKeys("grps@gmail.com"+Keys.ENTER);
	
	 
	
	
	 
}
}
