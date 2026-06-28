package selenium_Assignments;

import org.openqa.selenium.chrome.ChromeDriver;

//Write a programe for  gettitle method 
public class Assignment219 
{
  public static void main(String[] args) throws InterruptedException 
  {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in");
	Thread.sleep(2000);
	String title = driver.getTitle();
	System.out.println(title);
	
}
}
