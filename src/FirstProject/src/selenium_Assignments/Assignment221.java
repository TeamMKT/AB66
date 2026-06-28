package selenium_Assignments;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

//Write a programe for getWindowHandle and getWindowHandles method"
public class Assignment221 
{
    public static void main(String[] args) throws InterruptedException 
    {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(3000);
		String window  = driver.getWindowHandle();
		System.out.println(window);
		Set <String> set = driver.getWindowHandles();
		System.out.println(set);
		
	}
}

