package seleniumMKT_XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RealtiveX_path4 
{
   public static void main(String[] args) throws InterruptedException 
   {
	   ChromeDriver driver=new ChromeDriver();	
		driver.get("https://www.amazon.in/ap/signin?openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement search_tf = driver.findElement(By.xpath("//input[@name='email']"));
		search_tf .sendKeys("grudra2007@gmail.com");
		WebElement button = driver.findElement(By.xpath("//input[@type='submit']"));
		button .click();
		
		
}
}
