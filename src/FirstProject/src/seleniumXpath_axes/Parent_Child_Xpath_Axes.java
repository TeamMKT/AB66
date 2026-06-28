package seleniumXpath_axes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parent_Child_Xpath_Axes 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/?utm_source=chatgpt.com");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		
		WebElement email = driver.findElement(By.xpath("//input[@id='shub26']/preceding-sibling::label[text()='User Email']"));
		email.sendKeys("geeta.meduri@gmail.com");
		Thread.sleep(5000);
		
		WebElement password = driver.findElement(By.xpath("//label[text()='Password']/following-sibling::input[@id='pass']"));
		password.sendKeys("Grps@2007");
		Thread.sleep(5000);
		
		WebElement E1 = driver.findElement(By.xpath("//td[text()='Joe Root']/preceding-sibling::td/child::input"));
		E1.click();
		Thread.sleep(5000);
		
		
		
	
		
		
		

	}

}
