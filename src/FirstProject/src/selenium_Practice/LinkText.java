package selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText
{
	public static void main(String[] args) throws InterruptedException
	  {
		  ChromeDriver driver= new ChromeDriver();
		     driver.get("https://www.google.com");
		     driver.manage().window().maximize();
		     Thread.sleep(3000);
		     /*WebElement e1 = driver.findElement(By.linkText("Gmail"));
		     e1.click();*/
		     WebElement e2   = driver.findElement(By.partialLinkText("works"));
		     e2.click();
		     
}
}
