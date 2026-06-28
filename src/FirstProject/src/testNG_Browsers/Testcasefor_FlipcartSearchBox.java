package testNG_Browsers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListnerLogic1.class)
public class Testcasefor_FlipcartSearchBox extends Basetest3 
{
	@Test
	public void flipcartsearchbox() throws InterruptedException
	{
		WebElement Login = driver.findElement(By.xpath("//span[text()='✕']"));
		Login.click();
		Thread.sleep(3000);
		
		WebElement searchbox= driver.findElement(By.xpath("//input[@name='q']"));
		searchbox.sendKeys("Mobiles");
	}
	
	
	
}
