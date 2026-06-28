package seleniumMKT_XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkyScanner_flights {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
    	driver.get("https://www.skyscanner.co.in/?previousCultureSource=GEO_LOCATION&redirectedFrom=www.skyscanner.com");
    	driver.manage().window().maximize();
    	Thread.sleep(3000);
    	
    	//WebElement popup = driver.findElement(By.xpath("//div[@class='BpkModalInner_bpk-modal__content__NDM1Z']/div/div/descendant::button/child::*/child::*"));
    	/*popup.click();
    	Thread.sleep(3000);*/
	}

}
