/*"Assignment for Iframe:Amazon:Searching->Add it to Cart->go to the payment sheet->Credit card option
 [Almost impossibe 4 u]->Enter the Card details[Present inside an Iframe]" */
package selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_iframe
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();	
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	     Thread.sleep(3000);
		 WebElement searchTextBox=        driver.findElement(By.id("twotabsearchtextbox"));
	      searchTextBox.sendKeys("shoes");
	      WebElement searchingProduct=        driver.findElement(By.id("nav-search-submit-button"));
	      searchingProduct.click();
	      
	      Thread.sleep(3000);

}
}
