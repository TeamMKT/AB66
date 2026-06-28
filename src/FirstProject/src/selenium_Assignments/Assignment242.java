//"Write a script for Handling a Drop Down Using Select class Method "selectbyvisibleText"
package selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment242 {
	public static void main(String[] args) throws InterruptedException
	   {
		   ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.ebay.com/");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			WebElement searchproduct = driver.findElement(By.xpath("//select[@id='gh-cat']"));
			Select s1 = new Select(searchproduct);
			s1.selectByVisibleText("Cell Phones & Accessories");
			
			
			driver.close();

}
}
