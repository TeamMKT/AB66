package selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test 
{
  public static void main(String[] args) throws InterruptedException 
  {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.bseindia.com/indices/indexarchivedata");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	WebElement E1 = driver.findElement(By.xpath("//option[text()='Select Index']/parent::select"));
	Select s1 = new Select(E1);
	s1.selectByVisibleText(" BSE SENSEX NEXT 30 ");
	
	WebElement E2 = driver.findElement(By.xpath("//option[text()='Daily']/parent::select"));
	Select s2 = new Select(E2);
	s2.selectByVisibleText("Daily");
	
	WebElement from = driver.findElement(By.xpath("(//div[@class='datepicker-input-group'])[1]"));
	from.click();
	Thread.sleep(3000);
	
	List <WebElement> list = driver.findElements(By.xpath("//div[@class='ngb-dp-day']"));
	list.get(3).click();
	Thread.sleep(3000);
	
	WebElement to = driver.findElement(By.xpath("(//div[@class='datepicker-input-group'])[2]"));
	to.click();
	Thread.sleep(3000);
	
	List <WebElement> todate =driver.findElements(By.xpath("//div[@class='ngb-dp-day']"));
	todate.get(10).click();
	Thread.sleep(3000);
	
	WebElement submit = driver.findElement(By.xpath("//input[@value='Submit']"));
	submit.click();
	Thread.sleep(3000);
	
	

	
}
}
