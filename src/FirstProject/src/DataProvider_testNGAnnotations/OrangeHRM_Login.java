package DataProvider_testNGAnnotations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OrangeHRM_Login 
{
@DataProvider(name="values")
public Object [][] values() throws Throwable
{
	FileInputStream fs = new FileInputStream("C:\\Users\\geeta\\eclipse-workspace\\FirstProject\\test-output\\ExcelSheet\\AmazonTestData.xlsx");
	Workbook wb = WorkbookFactory.create(fs);
	Object [][] data = new Object[3][2];
	for(int i=0;i<wb.getNumberOfSheets();i++)
	{
		System.out.println("Sheet:" + i + "=" + wb.getSheetName(i));
	}
	for (int i=0;i<3;i++)
	{
		for(int j=0;j<2;j++)
		{
			data[i][j] = wb.getSheet("OrangeHRM_Login").getRow(i).getCell(j).getStringCellValue();
		}
	}
	return data;
}
@Test(dataProvider="values")
public void testcases(String UN, String PWD) throws InterruptedException
{
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	WebElement w1 = driver.findElement(By.name("username"));
	w1.sendKeys(UN);
	WebElement w2 = driver.findElement(By.name("password"));
	w2.sendKeys(PWD+Keys.ENTER);
	driver.close();
	
}
}
