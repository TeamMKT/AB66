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

public class Practice 
{
	@DataProvider(name="logindata")
	public Object[][] testforloginvalues() throws Exception
	{
	    FileInputStream fs = new FileInputStream(
	            "C:\\Users\\geeta\\eclipse-workspace\\FirstProject\\test-output\\ExcelSheet\\AmazonTestData.xlsx");

	    Workbook wb = WorkbookFactory.create(fs);

	    int rows = wb.getSheet("LoginDetails").getLastRowNum() + 1;

	    Object[][] data = new Object[rows][2];

	    for(int i=0; i<rows; i++)
	    {
	        data[i][0] = wb.getSheet("LoginDetails").getRow(i).getCell(0).toString();
	        data[i][1] = wb.getSheet("LoginDetails").getRow(i).getCell(1).toString();
	    }

	    wb.close();
	    return data;
	}
	@Test(dataProvider = "logindata")
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
	    System.out.println("Username: " + UN);
	    System.out.println("Password: " + PWD);
	}
}
