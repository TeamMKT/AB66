package selenium_Practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class Get_title_Get_CurrentURL 
{
	 public static void main(String[] args) throws InterruptedException 
	 {
		 ChromeDriver driver= new ChromeDriver();
	     driver.get("https://www.amazon.in");
	     driver.manage().window().maximize();
	     Thread.sleep(3000);
	     String title = driver.getTitle();
	     System.out.println(title);  
	     String url = driver.getCurrentUrl();
	     System.out.println(url);
	}
}
