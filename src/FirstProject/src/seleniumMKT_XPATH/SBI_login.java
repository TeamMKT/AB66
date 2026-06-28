package seleniumMKT_XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SBI_login
{
   public static void main(String[] args) throws InterruptedException
   {
	   ChromeDriver driver=new ChromeDriver();	
		driver.get("https://onlinesbi.sbi.bank.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement ln=	driver.findElement(By.xpath("//span[@class='classicTxt px-0']"));
		ln.click();
		WebElement ln1 = driver.findElement(By.xpath("//a[@class='login_button']"));
		ln1.click();
		
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("Geetajyothi");
		Thread.sleep(3000);
	
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	   password.sendKeys("Grps@2007");
	   WebElement captchavalue = driver.findElement(By.xpath("//input[@name='loginCaptchaValue']"));
	   captchavalue.sendKeys("3ep63");
		Thread.sleep(3000);
		
		WebElement login = driver.findElement(By.xpath("//input[@class='btn btn-default']"));
		  login.click();
		
		  WebElement reset = driver.findElement(By.xpath("//input[@id='reset_btn']"));
		  reset.click();
		  
		
		
}
}

