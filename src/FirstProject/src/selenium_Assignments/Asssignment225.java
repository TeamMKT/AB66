package selenium_Assignments;
/*Write a programe to lunch the browser and navigate https://www.amazon.in url and locate the webelement using id ,
method and perform opertion using Keys.ENTER*/
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asssignment225
{

	  public static void main(String[] args) throws InterruptedException 
	  {
		  ChromeDriver driver = new ChromeDriver();
		  driver.get("https://www.amazon.in");
		  driver.manage().window().maximize();
		  Thread.sleep(3000);
		  WebElement w1 = driver.findElement(By.id("twotabsearchtextbox"));
		  w1.sendKeys("shoes");
		  w1.sendKeys(Keys.ENTER);
}
}