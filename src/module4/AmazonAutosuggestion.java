package module4;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class AmazonAutosuggestion 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver=new ChromeDriver();	
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();

		Thread.sleep(3000);
		WebElement searchTextBox=	driver.findElement(By.id("twotabsearchtextbox"));
		searchTextBox.sendKeys("toys");
		Thread.sleep(3000);
		List<WebElement> list=	driver.findElements(By.xpath("//div[@role='rowgroup']/div/div"));
		int count=	list.size();
		list.get(count-1).click();
		Date d1=new Date();
		System.out.println(d1.getTime());
		
		
		Date d2=new Date(d1.getTime());
		System.out.println(d2);
		
		String format1=	d2.toString();
		String format2=	format1.replace(":", "");
		System.out.println(format2);
		TakesScreenshot ts=	(TakesScreenshot) driver;
		File source=	ts.getScreenshotAs(OutputType.FILE);
	//	File destination=new File("E:\\MKTProject\\AutomationBatch66\\screenshot\\Manish"+Math.random()+".png");
		File destination=new File("E:\\MKTProject\\AutomationBatch66\\screenshot\\"+new AmazonAutosuggestion().getClass()+format2+".png");

		FileHandler.copy(source, destination);
		
/*
 * 
 * Step 1: Upcast the driver to TakesScreenshot(I)				
Step 2: Call its methods called as getScreenshotAs to take a  screenshot[Source]				
"Step 3: Provide the destination where you wish to keep your screenshot after taking it using File Class

File destination=new File(""LOCATION"");"				
"Step 4: Copy the screenshot from source to the destination using
FileHandler.copy(source,destination);"				
 */
	}
}
