package seleniumAutomation_MKT;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launching {
	public static void main(String[] args) throws InterruptedException 
	  {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
}
}