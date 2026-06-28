package seleniumMKT_XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RealtiveX_path 
{
   public static void main(String[] args) throws InterruptedException 
   {
	   ChromeDriver driver=new ChromeDriver();	
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement search_tf = driver.findElement(By.xpath("(//textarea)[1]"));
		search_tf .sendKeys("India");
}
}
