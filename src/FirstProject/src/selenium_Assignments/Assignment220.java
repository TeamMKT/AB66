package selenium_Assignments;
//Write a programe for fetching currentURL by using selenium 
import org.openqa.selenium.chrome.ChromeDriver;

//Write a programe for fetching currentURL by using selenium 
public class Assignment220
{
  public static void main(String[] args) throws InterruptedException 
  {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	Thread.sleep(2000);
	String url = driver.getCurrentUrl();
	System.out.println(url);
	driver.close();
	
	
}
}
