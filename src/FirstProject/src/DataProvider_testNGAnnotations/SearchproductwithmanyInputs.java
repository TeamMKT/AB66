package DataProvider_testNGAnnotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class SearchproductwithmanyInputs 
{
 @DataProvider()
 public Object testdataforSearching()
 {
	 Object [][] d1= new Object[10][1];
	 d1[0][0]="shoes";
	 d1[1][0]="toys";
	 d1[2][0]="shirts";
	 d1[3][0]="kurthis";
	 d1[4][0]="books";
	 d1[5][0]="cameras";
	 d1[6][0]="mobiles";
	 d1[7][0]="bluetooths";
	 d1[8][0]="kitchen tools";
	 d1[9][0]="slippers"; 
	 
	 return d1;//here, the return type is not void in the method, so we use return keyword.
 }
 
 @Test(dataProvider="testdataforSearching")
 public void testcase(String input) throws InterruptedException
 {
	 ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.Amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys(input);
		
		WebElement searchingProduct = driver.findElement(By.id("nav-search-submit-button"));
	    searchingProduct.click();
	    Thread.sleep(3000);
 }
}
