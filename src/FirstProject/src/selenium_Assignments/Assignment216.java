package selenium_Assignments;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//"Write a programe for launch chrome , Edg,Firefoxbrowser"
public class Assignment216 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		EdgeDriver driver1 = new EdgeDriver();
		driver1.manage().window().maximize();
		FirefoxDriver driver2 = new FirefoxDriver();
		driver2.manage().window().maximize();
	
	}

}
