package selenium_Assignments;

import org.openqa.selenium.chrome.ChromeDriver;

//Write a programe to launch browser and use close and quit driver method
public class Assignment218
{
   public static void main(String[] args) 
   {
	   ChromeDriver driver = new ChromeDriver();
	   driver.get("https://www.google.com");
	   driver.close();
	   
	   
}
}
