package bookMyShow;
//4. Click on Continue with Google
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC_Scenario4 extends BaseTest
{
	@Test
	public void continuewithgoogle() throws InterruptedException
	{
		WebElement selectcity = driver.findElement(By.xpath("//input[@inputmode='text']"));
		selectcity.sendKeys("Vizag"+Keys.ENTER);
		Thread.sleep(5000);
		
		WebElement direction = driver.findElement(By.xpath("//div[@class='sc-5d56x9-2 gJnqzY']"));
		direction.click();
		Thread.sleep(5000);
		
		WebElement signin = driver.findElement(By.xpath("//button[@aria-label='Sign in']"));
		signin.click();
		Thread.sleep(4000);
		
	/*WebElement cntegle = driver.findElement(By.xpath("(//div[@class='sc-z1ldnh-5 hwrHAr'])[1]"));
	cntegle.click();
	Thread.sleep(5000);*/
	
	WebElement cntegle = driver.findElement(By.xpath("(//div[@class='sc-5joutf-2 fVqStC']/div)[1]"));
	cntegle.click();
	Thread.sleep(5000);
	
	
}
}
