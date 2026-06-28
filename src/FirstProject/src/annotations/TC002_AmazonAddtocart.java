package annotations;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listeners_Logic.class)
public class TC002_AmazonAddtocart extends BaseTest_Assertions
{
@Test(retryAnalyzer=RetryAnalyzerLogic.class)
public void addtocartamazon() throws InterruptedException
{
	WebElement searchproduct = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	  searchproduct.sendKeys("mobiles"+Keys.ENTER);
	  Thread.sleep(3000);

  WebElement product1= driver.findElement(By.xpath("//a[@class='a-link-normal s-no-outline'][1]"));
  product1.click();
  Thread.sleep(3000);
  
 Set <String> pcid =  driver.getWindowHandles();
 System.out.println(pcid);
 Iterator<String> id = pcid.iterator();
 String parentid =  id.next();
 String childid= id.next();
 driver.switchTo().window(childid);
 Thread.sleep(3000);
 
	WebElement addtocart=  driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]"));
	  addtocart.click();
	 Thread.sleep(3000);
	  
	 
}
}
