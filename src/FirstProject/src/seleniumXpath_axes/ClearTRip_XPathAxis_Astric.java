package seleniumXpath_axes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTRip_XPathAxis_Astric {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/flights?utm_source=bing&utm_medium=cpa&utm_campaign=BR_Cleartrip%7CMain_E&msclkid=b6defe900dc0174c1f8a948e9f123d29");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        
        WebElement login = driver.findElement(By.xpath("(//div[@data-testid='loginPopup']/div/div)[2]/child::*/child::*"));
        login.click();
        Thread.sleep(3000);
        
        WebElement Wherefrom = driver.findElement(By.xpath("//input[@placeholder='Where from?']"));
        Wherefrom.sendKeys("Visakhapatnam");
        Thread.sleep(3000);
        
        List <WebElement> source = driver.findElements(By.xpath("//div[@role='listbox']/ul"));
        source.get(0).click();
        Thread.sleep(3000);
        
        WebElement Whereto = driver.findElement(By.xpath("//input[@placeholder='Where to?']"));
        Whereto.sendKeys("Bengaluru"+Keys.ENTER);
        Thread.sleep(3000);
        
        List <WebElement> destination = driver.findElements(By.xpath("//div[@role='listbox']/ul"));
        destination.get(0).click();
        Thread.sleep(3000);
        
        WebElement calldate = driver.findElement(By.xpath("//div[@data-testid='dateSelectOnward']/div/child::*"));
        calldate.click();
        Thread.sleep(3000);
        
        WebElement rightarrow = driver.findElement(By.xpath("(//div[@class='DayPicker-wrapper']/div/div)[2]/child::*/child::*"));
        rightarrow.click();
        Thread.sleep(6000);
        
        /*WebElement date = driver.findElement(By.xpath("//div[@class='Day-grid flex flex-middle flex-column flex-top'][1]"));
       date.click();
       Thread.sleep(3000);*/
        
        
        List <WebElement> datelist = driver.findElements(By.xpath("//div[@class='Day-grid flex flex-middle flex-column flex-top']"));
        datelist.get(10).click();
        Thread.sleep(3000);
        
        
       
        
        //(//div[@class='DayPicker-wrapper']/div/div)[2]/child::*/child::*
        
      //div[@class='Day-grid flex flex-middle flex-column flex-top']
        		
        		
        
        
        
        
	}

}
