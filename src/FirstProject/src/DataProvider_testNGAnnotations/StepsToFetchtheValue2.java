package DataProvider_testNGAnnotations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepsToFetchtheValue2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream fs = new FileInputStream("C:\\Users\\geeta\\eclipse-workspace\\FirstProject\\test-output\\ExcelSheet\\AmazonTestData.xlsx");
		Workbook wb = WorkbookFactory.create(fs);
	
         String UN = wb.getSheet("LoginDetails").getRow(0).getCell(0).getStringCellValue();
         System.out.println("The userName is:->" + UN);  //ShortMehtod.
		 
		String PWD =  wb.getSheet("LoginDetails").getRow(1).getCell(0).getStringCellValue();
		System.out.println("The Password is:->"+PWD);
		
		ChromeDriver driver = new ChromeDriver();
		  driver.get("https://www.facebook.com");
		  driver.manage().window().maximize();
		  WebElement w1 = driver.findElement(By.name("email"));
		  w1.sendKeys(UN);
		  WebElement w2 = driver.findElement(By.name("pass"));
		  w2.sendKeys(PWD);
		
		 
		
		  

	}

}
