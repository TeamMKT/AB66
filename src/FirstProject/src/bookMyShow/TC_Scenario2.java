package bookMyShow;
//2.Click on Book Tickets

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC_Scenario2 extends BaseTest
{
@Test
public void booktickets() throws InterruptedException
{
	WebElement selectcity = driver.findElement(By.xpath("//input[@inputmode='text']"));
	selectcity.sendKeys("Vizag"+Keys.ENTER);
	Thread.sleep(3000);
	
	WebElement direction = driver.findElement(By.xpath("//div[@class='sc-5d56x9-2 gJnqzY']"));
	direction.click();
	Thread.sleep(4000);
	
	WebElement booktickets = driver.findElement(By.xpath("(//span[text()='Book tickets'])[1]"));
	 booktickets.click();
     Thread.sleep(4000);
     
	//button[@data-phase='postRelease']/descendant::span[text()='Book tickets']
	
	//button[@data-phase='postRelease']
     
      //(//div[@id='page-cta-container']/descendant::span[text()='Book tickets'])[1]
      //(//div[@id='page-cta-container'])[1]
      
    //div[@class='sc-87c3kj-1 hgojWR']
      
    /*WebElement date = driver.findElement(By.xpath("(//div[@class='sc-6bpksa-0 hiVcXH'])[2]"));
    date.click();
    Thread.sleep(4000);
    
  
    
   WebElement theatre=  driver.findElement(By.xpath("//div[@class='sc-e8nk8f-3 kJBeM']/descendant::span[text()='INOX: Varun Beach, Beach Road']"));
   theatre.click();
   Thread.sleep(4000);*/
   
 //div[@class='sc-e8nk8f-4 QqzNF']/descendant::div[@class='sc-1vhizuf-1 hlrCBW']/div[text()='10:00 AM']
   

	
	
}
}
