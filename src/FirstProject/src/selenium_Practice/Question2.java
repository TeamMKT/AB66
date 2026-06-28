package selenium_Practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
/*1. Launch https://www.hopscotch.in, 2. Click on Account; 3. Click on Sign in; 4. Click on Join us
5. Enter Full name, Email id and Mobile No; 6. Click on Send OTP*/
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 
{
	public static void main(String[] args) throws InterruptedException 
	   {
		  ChromeDriver driver = new ChromeDriver();
		  driver.get("https://www.hopscotch.in/");
		  driver.manage().window().maximize();
		  Thread.sleep(3000);
		  
		  WebElement account = driver.findElement(By.xpath("//span[@class='float-right account-update']"));
		  account.click();
		  Thread.sleep(3000);
		  
		  WebElement signin = driver.findElement(By.xpath("//button[@class='css-j01lhz css-1ab9hxj']"));
		  signin.click();
		  Thread.sleep(3000);
		  
		  WebElement joinus = driver.findElement(By.xpath("//a[@class='css-1tg3gbc']"));
		  joinus.click();
		  Thread.sleep(3000);
		  
		  WebElement fullname = driver.findElement(By.xpath("//input[@type='text']"));
		  fullname.sendKeys("Geetajyothi");
		  WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		  email.sendKeys("geeta.meduri@gmail.com");
		  WebElement mobileno = driver.findElement(By.xpath("//input[@type='number']"));
		  mobileno .sendKeys("8500448418");
		  Thread.sleep(3000);
		  
		  WebElement otp = driver.findElement(By.xpath("//button[@type='submit']"));
		  otp.click();
		  Thread.sleep(3000);
		  
		  driver.close();
		
		  
		  
		  
		  
		  
		
		  
		
}
}
