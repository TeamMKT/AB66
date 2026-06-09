package testngprograms;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TimeOutParameter 
{
		
	
		@Test(timeOut=1000)
		public void login()
		{
			ChromeDriver driver=new ChromeDriver();
		}
		
}
