package selenium_Automation;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot 
{
  public static void main(String[] args) throws InterruptedException, IOException
  {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	WebElement searchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	searchbox.sendKeys("shoes"+Keys.ENTER);
	Thread.sleep(3000);
	
      TakesScreenshot ts = driver;
      File source = ts.getScreenshotAs(OutputType.FILE);
      File destination  =  new File("C:\\Users\\geeta\\eclipse-workspace\\FirstProject\\screenshot\\geeta.png");
      FileHandler.copy(source, destination);
      
      
      
	
	
	
}
}
