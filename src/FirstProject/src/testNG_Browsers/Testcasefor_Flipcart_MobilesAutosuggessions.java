package testNG_Browsers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListnerLogic1.class)
public class Testcasefor_Flipcart_MobilesAutosuggessions extends Basetest3 
{
	@Test
	public void flipcartautosuggessions() throws InterruptedException
	{
		WebElement Login = driver.findElement(By.xpath("//span[text()='✕']"));
		Login.click();
		Thread.sleep(3000);
		
		WebElement searchbox= driver.findElement(By.xpath("//input[@name='q']"));
		searchbox.sendKeys("Mobiles");
		
		List <WebElement> list = driver.findElements(By.xpath("//ul[@class='VCplLH lTpUwR bRjjIF _1psv1ze5l _1psv1ze9l _1psv1ze7c _1cisqlf2']/li"));
		int count = list.size();
		Thread.sleep(3000);
	}
}
