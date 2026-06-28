package testNG_Browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listeners_Logic_quikr.class)
public class Test_Scenario2_clickonDropdown extends BaseTest_Quikr2_listener
{
  @Test
  public void quikrdropdown() throws InterruptedException
  {
	  WebElement allcategories = driver.findElement(By.xpath("//a[@id='searchedCat']"));
		 allcategories.click();
		 Thread.sleep(3000);
		 
		 WebElement jobs = driver.findElement(By.xpath("//div[@class='drop-layers cate-layer']/ul/li/a[@title='Jobs']"));
		 jobs.click();
		 Thread.sleep(3000);
  }
  @Test
  public void searchfortesting() throws InterruptedException
  {
	  WebElement allcategories = driver.findElement(By.xpath("//a[@id='searchedCat']"));
		 allcategories.click();
		 Thread.sleep(3000);
		 
		 WebElement jobs = driver.findElement(By.xpath("//div[@class='drop-layers cate-layer']/ul/li/a[@title='Jobs']"));
		 jobs.click();
		 Thread.sleep(3000);
	  WebElement typetesting = driver.findElement(By.xpath("//input[@id='query']"));
		 typetesting.sendKeys("Type Testing");
		 Thread.sleep(3000);
		 
		 WebElement softwaretesting = 
				 driver.findElement(By.xpath("(//div[@class='scroll-layer']/div)[2]/a/descendant::span[text()='software testing']"));
		 softwaretesting.click();
		 Thread.sleep(3000);

		WebElement jobapply= 
		driver.findElement(By.xpath("(//div[@class='job-card apply-block adImpression-click-event adImpression-event-class1'])[1]"));
		jobapply.click();
		 Thread.sleep(3000);
  }
}
