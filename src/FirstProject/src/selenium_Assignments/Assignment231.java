package selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/* Write a Script  to automate https://grotechminds.com/registeration-form/
  using id,name ,tagname,linkText,partialLinktext locater, note:-Dont automate gender,state,checkbox and Register"*/
public class Assignment231 
{
   public static void main(String[] args) throws InterruptedException
   {
	   ChromeDriver driver = new ChromeDriver();
	   driver.get("https://grotechminds.com/registeration-form/");
	   driver.manage().window().maximize();
	   Thread.sleep(3000);
	    WebElement e1 = driver.findElement(By.id("firstName"));
	    e1.sendKeys("Geeta");
	    WebElement e2 = driver.findElement(By.id("lastName"));
	    e2.sendKeys("Meduri");
	    WebElement e3 = driver.findElement(By.id("email"));
	    e3.sendKeys("geeta.meduri@gmail.com");
	    WebElement e4 = driver.findElement(By.id("phone"));
	    e4.sendKeys("8500448418");
	    WebElement a1 = driver.findElement(By.id("aadhaar"));
	    a1.sendKeys("1234565789");
	    WebElement a2 = driver.findElement(By.id("pan"));
	    a2.sendKeys("abced1fg");
	   WebElement a3 = driver.findElement(By.linkText("Courses"));
	    a3.click();
	    WebElement a4 = driver.findElement(By.linkText("Home"));
	    a4.click();
	    WebElement a5 = driver.findElement(By.partialLinkText("Students"));
	    a5.click();
	    WebElement a6 = driver.findElement(By.partialLinkText("Contact"));
	    a6.click();
	    WebElement a7 = driver.findElement(By.linkText("Login"));
	    a7.click();
	    
	    
	    
	    
	    /*WebElement e5 = driver.findElement(By.id("state"));
	    e5.click();
	    Select s1 = new Select (e5);
	    //s1.selectByVisibleText("assam");
	    s1.selectByIndex(5);*/
	    
	  
	    
	    
	    
	    
	    
	    
}
}
