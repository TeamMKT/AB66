package seleniumXpath_axes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HyR_tutorials_Xpath_axes {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//following sibling
		WebElement E1 = driver.findElement(By.xpath("//label[text()='Last Name']/following-sibling::input[@type='text'][1]"));
		E1.sendKeys("Geetajyothi");
		 
		//preceding sibling and child inside prededing sibling
		
		WebElement E2 = driver.findElement(By.xpath("//td[text()='Roland Mendel']/preceding-sibling::td/child::input"));
		E2.click();
		
		WebElement E3 = driver.findElement(By.xpath("//td[text()='Yoshi Tannamuri']/preceding-sibling::td/child::input"));
		E3.click();
		
		WebElement E = driver.findElement(By.xpath("//td[text()='Giovanni Rovelli']/preceding-sibling::td/child::input"));
		E.click();
		
		//in table parent to child
		WebElement E4 = driver.findElement(By.xpath("//table[@id='contactList']/child::tbody/child::tr"));
		E4.click();
		
		//child to parent
		
		WebElement E5 = driver.findElement(By.xpath("//td[text()='Francisco Chang']/parent::tr"));
		
		boolean b1 = E5.isDisplayed();
		System.out.println(b1);
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
	}

}
