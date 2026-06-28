/*"WAP  to launch cleartrip.com
->close the pop up->Enter from->Enter To->(BLR TO DEL)->Click on Calender->Click on right arrow[it will take you to the next month]
->Click on any date based on above XPATH->Click on return calender->select any date from the list which are avaiable"*/						
package seleniumXpath_axes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cleartrip_Flights_RoundWAY_ticket
{
  public static void main(String[] args) throws InterruptedException
  {
	  ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.cleartrip.com/flights?utm_source=bing&utm_medium=cpa&utm_campaign=BR_Cleartrip%7CMain_E&msclkid=e9a47e6026e019b95d3d14400705efaf");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		WebElement login = driver.findElement(By.xpath("(//div[@data-testid='loginPopup']/div/div)[2]/child::*/child::*"));
		login.click();
		Thread.sleep(8000);
		
		WebElement from = driver.findElement(By.xpath("//input[@placeholder='Where from?']"));
		from.sendKeys("Visakhapatnam");
		Thread.sleep(5000);
		
		List <WebElement> sourcelist = driver.findElements(By.xpath("//div[@role='listbox']/ul"));
		sourcelist.get(0).click();
		Thread.sleep(4000);
		
		WebElement to = driver.findElement(By.xpath("//input[@placeholder='Where to?']"));
		to.sendKeys("Chennai");
		Thread.sleep(3000);
		
		List <WebElement> destinylist = driver.findElements(By.xpath("//div[@role='listbox']/ul"));
		destinylist.get(0).click();
		Thread.sleep(3000);
		
		WebElement calender = driver.findElement(By.xpath("//div[@data-testid='dateSelectOnward']/div/child::*"));
		calender.click();
		Thread.sleep(3000);
		
		WebElement rightarrow = driver.findElement(By.xpath("(//div[@class='DayPicker-wrapper']/div/div)[2]/child::*/child::*"));
		rightarrow.click();
		Thread.sleep(3000);
		
		WebElement sourcedate = driver.findElement(By.xpath("(//div[@class='Day-grid flex flex-middle flex-column flex-top'])[20]"));
		sourcedate.click();
		Thread.sleep(3000);
		
		WebElement returnto = driver.findElement(By.xpath("//div[@data-testid='dateSelectReturn']/child::span"));
		returnto.click();
		Thread.sleep(5000);
		
		WebElement returndate = driver.findElement(By.xpath("(//div[@class='Day-grid flex flex-middle flex-column flex-top'])[25]"));
		returndate.click();
		Thread.sleep(3000);
		
	
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
