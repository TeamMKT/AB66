package seleniumMKT_XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EaseMyTrip {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
    	driver.get("https://www.easemytrip.com/");
    	driver.manage().window().maximize();
    	Thread.sleep(3000);
    	
    	WebElement iframe = driver.findElement(By.xpath("//iframe[@id='iFrame1']"));
    	driver.switchTo().frame(iframe);
    	Thread.sleep(5000);
    	
    	WebElement chatbot = driver.findElement(By.xpath("//div[@id='eva_intro']/descendant::button[text()='Let’s Chat']"));
    	chatbot.click();
    	Thread.sleep(5000);

	}

}
