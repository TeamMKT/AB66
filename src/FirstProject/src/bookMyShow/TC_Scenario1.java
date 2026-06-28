package bookMyShow;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Scenario1 extends BaseTest
{
	@Test
	  public void launchbrowser() throws InterruptedException
	  {
	   
		WebElement selectcity = driver.findElement(By.xpath("//input[@inputmode='text']"));
		selectcity.sendKeys("Vizag"+Keys.ENTER);
		Thread.sleep(3000);
		
		WebElement direction = driver.findElement(By.xpath("//div[@class='sc-5d56x9-2 gJnqzY']"));
		direction.click();
		Thread.sleep(3000);
		
		
		WebElement searchforamovie = driver.findElement(By.xpath("//span[@class='sc-1or3vea-15 bMabGE']"));
		searchforamovie.click();
		Thread.sleep(5000);
		
		/*WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("Maa Inti bangaram");
		//input[@class='sc-10a0gyl-4 caTwDa']*/
		
		WebElement search1 = driver.findElement(
		By.xpath("//input[@placeholder='Search for movies, events, plays, sports...']"));
		search1.sendKeys("Maa Inti Bangaram");
		
		
		WebElement autosugg = driver.findElement(By.xpath("(//div[@class='sc-4s6lbp-0 dhburN']/div)[1]"));
		autosugg.click();
		Thread.sleep(5000);
		
		//div[@class='sc-1or3vea-13 kudrkl']/descendant::span/preceding-sibling::span/child::*
		//span[@class='sc-1or3vea-15 bMabGE']
		
		
		
	  }	
}
