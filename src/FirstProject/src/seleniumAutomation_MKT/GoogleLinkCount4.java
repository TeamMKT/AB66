package seleniumAutomation_MKT;
//WAP to fetch all linktext of each 25 links
//gettext(), method tell about the name of url.
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLinkCount4 
{
   public static void main(String[] args) throws InterruptedException
   {
	  ChromeDriver driver = new ChromeDriver();
	  driver.get("https://www.google.com");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	    List <WebElement> list =driver.findElements(By.tagName("a"));
	    Thread.sleep(3000);
	    for(int i=0;i<list.size();i++)
	    {
	    	    WebElement e2 = list.get(i);
	    	    String text =e2.getText();
	    	    System.out.println(text);
	    }
	    
		  
}
}
