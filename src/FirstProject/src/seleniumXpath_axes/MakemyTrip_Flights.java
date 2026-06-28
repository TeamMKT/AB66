package seleniumXpath_axes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakemyTrip_Flights {

public static void main(String[] args) throws InterruptedException
 {
 ChromeDriver driver= new ChromeDriver();
 driver.get("https://www.makemytrip.com/");
 driver.manage().window().maximize();
 Thread.sleep(5000);

 WebElement loginpopup = driver.findElement(By.xpath("//section[@class='modalMain tcnFooter']/child::span"));
 loginpopup.click();
 Thread.sleep(5000);
				
WebElement flights = driver.findElement(By.xpath("//span[@class='headerIconWrapper']/child::span"));
flights.click();
Thread.sleep(5000);

WebElement formfield = driver.findElement(By.xpath("//label[@for='fromCity']"));
formfield.click();
Thread.sleep(5000);

WebElement from = driver.findElement(By.xpath("//input[@placeholder='From']"));
from.sendKeys("Pune");
Thread.sleep(5000);
from.click();

 /*List <WebElement> from1= driver.findElements(By.xpath("(//div[@role='listbox']/div)[4]/descendant::div"));
from1.get(0).click();
Thread.sleep(10000);*/

WebElement tofield = driver.findElement(By.xpath("//label[@for='toCity']"));
tofield.click();
Thread.sleep(5000);

WebElement to = driver.findElement(By.xpath("//input[@placeholder='To']"));
to.sendKeys("Chennai");
Thread.sleep(5000);
from.click();

/*List <WebElement> destinylist = driver.findElements(By.xpath("//div[@role='listbox']/div"));
destinylist.get(0).click();
Thread.sleep(4000);*/



				
				
				
				

	}

}
