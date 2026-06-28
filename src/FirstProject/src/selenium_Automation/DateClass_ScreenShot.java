package selenium_Automation;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class DateClass_ScreenShot
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
		
	 Date d1 = new Date();
	 long l1 = d1.getTime();
	 System.out.println(l1);   //this is Epoch time menas machine generated time.
	 
	 Date d2 = new Date (d1.getTime());
	 System.out.println(d2);  // it gives the human understandable time.
	 
	 String format1  = d2.toString();
	 String format2 = format1.replace(":" , "");
	 System.out.println(format2);
	 
	TakesScreenshot ts = driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File destination = 
new File("C:\\Users\\geeta\\eclipse-workspace\\FirstProject\\screenshot\\"+new DateClass_ScreenShot().getClass()+format2+".png");

	FileHandler.copy(source, destination);
	
	 
	 
	 
}
}
