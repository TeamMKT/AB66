/*"WAP to enter the email id here with absolute X apth
https://www.amazon.in/business/register/org/landing?ref_=ab_reg_signin_unifiedauth"*/
package selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment238
{
  public static void main(String[] args) throws InterruptedException
  {
	  ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/business/register/org/landing?ref_=ab_reg_signin_unifiedauth");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement E1 = driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/form/fieldset/input)"));
		E1.sendKeys("geeta.meduri@gmail.com");
}
}
