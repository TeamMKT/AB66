package annotations;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listeners_Logic.class)
public class TC001_Amazon extends BaseTest_Assertions
{
@Test(retryAnalyzer = RetryAnalyzerLogic.class)
public void amazonsearchproduct() throws InterruptedException
{
	WebElement searchproduct = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	  searchproduct.sendKeys("mobiles"+Keys.ENTER);
	  Thread.sleep(3000);
	  
	  List <WebElement> list = driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
	  int count = list.size();
	  System.out.println(count);
	 
}
	  
	  
	  
	  
}

