package bookMyShow;
//3 . Click on signin
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class TC_Scenario3 extends BaseTest
{
@Test
public void signin() throws InterruptedException
{
	WebElement selectcity = driver.findElement(By.xpath("//input[@inputmode='text']"));
	selectcity.sendKeys("Vizag"+Keys.ENTER);
	Thread.sleep(3000);
	
	WebElement direction = driver.findElement(By.xpath("//div[@class='sc-5d56x9-2 gJnqzY']"));
	direction.click();
	Thread.sleep(3000);
	
	WebElement signin = driver.findElement(By.xpath("//button[@aria-label='Sign in']"));
	signin.click();
	Thread.sleep(4000);
	
	/*WebElement mobile = driver.findElement(By.xpath("//input[@id='userMobileNumber']"));
	mobile.sendKeys("8500448418");*/
	
	//div[@class='sc-zgl7vj-0 cCLllD']
	
	//(//div[@class='sc-z1ldnh-5 hwrHAr'])[1]
}
}
