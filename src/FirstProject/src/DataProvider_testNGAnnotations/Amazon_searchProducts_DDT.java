package DataProvider_testNGAnnotations;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Amazon_searchProducts_DDT 
{
@DataProvider(name="products")
public Object [][] products() throws Throwable
{
	FileInputStream fs=  new FileInputStream("C:\\Users\\geeta\\eclipse-workspace\\FirstProject\\test-output\\ExcelSheet\\AmazonTestData.xlsx");
          Workbook wb = WorkbookFactory.create(fs);
          Object [][] data = new Object[10][1];
          for(int i=0;i<wb.getNumberOfSheets();i++)
          {
        	  System.out.println("Sheet:" +i+"="+wb.getSheetName(i));
          }
          for(int i=0;i<10;i++)
          {
        	  for(int j=0;j<1;j++)
        	  {
        		  data[i][j]=wb.getSheet("SeacrchingProducts").getRow(i).getCell(j).getStringCellValue();
        		  
        	  }
          }
		  return data;
}
@Test(dataProvider = "products")
public void testcases(String srpds) throws InterruptedException
{
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://amazon.in");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	WebElement w1 = driver.findElement(By.id("twotabsearchtextbox"));
	w1.sendKeys(srpds+Keys.ENTER);
	System.out.println("Searching products:" + srpds);
	driver.close();
	
	
          
}
}
