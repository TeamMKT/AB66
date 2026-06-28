package selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SBI_UrlsCount 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		   driver.get("https://retail.sbi.bank.in/retail/login.htm");
		     driver.manage().window().maximize();
		     Thread.sleep(3000);
		     List <WebElement> list = driver.findElements(By.tagName("a"));
		     Thread.sleep(3000);
		    /*int count = list.size();
		    System.out.println(count);
		             WebElement e1=list.get(2);
		             String text  =e1.getText();
		             System.out.println(text);
		             e1.click();*/
		             for(int i=0;i<list.size();i++)
		             {
		            	 WebElement e2 = list.get(i);
		            	 String text  = e2.getText();
		            	 System.out.println(text);
		             }
	}
}
