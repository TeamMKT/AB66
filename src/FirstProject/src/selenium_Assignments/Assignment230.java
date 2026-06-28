package selenium_Assignments;
//"Write a progrmae laucnh Amazon  and click on Customer Service"
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment230 
{
   public static void main(String[] args) throws InterruptedException
   {
	   ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(3000);
        WebElement a = driver.findElement(By.partialLinkText("customer"));
            a.click();
 
}
}
