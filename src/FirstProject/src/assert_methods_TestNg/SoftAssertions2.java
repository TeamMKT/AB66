package assert_methods_TestNg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions2 extends BaseTest_AmazonAssertions
{
	@Test
	public void amazonLogin() throws InterruptedException
	{
		//Assertion A1 = new Assertion();
		SoftAssert s1=new SoftAssert();
		WebElement accountList = driver.findElement(By.xpath("//div[@id='nav-link-accountList']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(accountList).perform();
		
		WebElement signInbutton = driver.findElement(By.xpath("//div[@id='nav-al-signin']"));
		signInbutton.click();
		Thread.sleep(3000);
		WebElement loginTmobile = driver.findElement(By.xpath("//input[@type='email']"));
		loginTmobile.sendKeys("8500448418");
		
		Thread.sleep(3000);
		WebElement continuebutton = driver.findElement(By.xpath("//input[@type='submit']"));
		continuebutton.click();
		
		WebElement passwordA =driver.findElement(By.xpath("//input[@type='password']"));
		passwordA.sendKeys("Grps@2007");
		
		WebElement signSubmit =driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		signSubmit.click();
		
		WebElement SearchBox = driver.findElement(By.id("twotabsearchtextbox"));
		SearchBox.sendKeys("toys for baby");
		Thread.sleep(4000);
		List<WebElement> SearchAutoSugg = driver.findElements(By.xpath("//div[@role='rowgroup']/child::div[1]/div"));
		SearchAutoSugg.get(1).click();
		Thread.sleep(3000);
		
	List <WebElement> xpathrhne  	= driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
	s1.assertEquals(xpathrhne.size()>50,true,"Sorry-COnditions could not be same" );
	s1.assertAll();
	//Assert.assertEquals(xpathrhne.size()==72,72,"Sorry-COnditions could not be same" );
	

	}
	
	

}
