package assert_methods_TestNg;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssrtionsClass extends BaseTest_AmazonAssertions
{
	@Test
	public void amazonLogin() throws InterruptedException
	{
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
		SearchBox.sendKeys("shoes");
		Thread.sleep(4000);
		
		List<WebElement> SearchAutoSugg = driver.findElements(By.xpath("//div[@role='rowgroup']/child::div[1]/div"));
		SearchAutoSugg.get(1).click();
		Thread.sleep(3000);
		
		List<WebElement> OpenSearchResult = driver.findElements(By.xpath("//div[@role='listitem']/descendant::div[@data-cy='image-container']"));
		OpenSearchResult.get(0).click();
		Thread.sleep(4000);
		
		Set<String> windos = driver.getWindowHandles();
		Iterator<String> allwind = windos.iterator();
		String pid = allwind.next();
		String cid= allwind.next();
		driver.switchTo().window(cid);
		Thread.sleep(2000);
		
		WebElement addToCartBttn = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		addToCartBttn.click();
		Thread.sleep(2000);
		
		String s1=	driver.getCurrentUrl();
		
		//Assert.assertEquals(s1.matches("(.)cart(.)"), true,"Sorry-But the condition did not match 1st assertion failed");	
		Assert.assertTrue(s1.contains("cart"));
		
		//lets apply 1 more for learning
		
		
		WebElement addToCarMess = driver.findElement(By.xpath("//div[@id='NATC_SMART_WAGON_CONF_MSG_SUCCESS']/h1"));
		Assert.assertEquals(addToCarMess.getText(), "Added to cart","Sorry-But the condotion did not match");
	}
	
	

}

