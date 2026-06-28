package DataProvider_testNGAnnotations;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class FaceBook_DDT_DataProvider {
	@DataProvider(name = "testforloginvalues")
	public Object [][] testforloginvalues() throws Exception 
	{
		FileInputStream fs = new FileInputStream("C:\\Users\\geeta\\eclipse-workspace\\FirstProject\\test-output\\ExcelSheet\\AmazonTestData.xlsx");
		Workbook wb = WorkbookFactory.create(fs);
		
		Object [][] d1 = new Object [4][2];
		
		for(int i=0;i<2;i++)//i means row
		{
			for(int j=0;j<2;j++)//j means CEll or Column
			{
				try
				{
					d1[i][j]= wb.getSheet("LoginDetails").getRow(i).getCell(j).getStringCellValue();
				}
				catch(IllegalStateException e1)
				{
					d1[i][j]= NumberToTextConverter.toText(wb.getSheet("LoginDetails").getRow(i).getCell(j).getNumericCellValue());
				}
			}
		}	 
		return d1;
	}
	@Test(dataProvider="testforloginvalues")
	  public void testcases(String UN, String PWD) throws InterruptedException
	  {
		  ChromeDriver driver = new ChromeDriver();
		  driver.get("https://www.facebook.com");
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  WebElement w1 = driver.findElement(By.name("email"));
		  w1.sendKeys(UN);
		  WebElement w2 = driver.findElement(By.name("pass"));
		  w2.sendKeys(PWD + Keys.ENTER);
	  }	
	
}
