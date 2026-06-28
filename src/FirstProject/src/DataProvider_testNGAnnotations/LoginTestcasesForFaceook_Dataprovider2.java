package DataProvider_testNGAnnotations;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class LoginTestcasesForFaceook_Dataprovider2 
{
@DataProvider()
public Object testforloginvalues() 
{
	Object [][] d1 = new Object [5][2];
	//ist row
	d1[0][0]="UN1";  //valid UN as email
	d1[0][1]="PWD1";               //valid pwd 
	
	//2nd row
	d1[1][0]="UN2";  //valid UN as mobile
	d1[1][1]="PWD2";   //valid pwd 
	
	//3rd row
	d1[2][0]="UN3";  //valid UN as mobile
	d1[2][1]="PWD3";   //invalid pwd 
	
	//4th row
	d1[3][0]="UN4";  //invalid UN as email
	d1[3][1]="PWD4";   //invalid pwd 
	 
	//5th row
	d1[4][0]="";  //invalid UN as email
	d1[4][1]="";   //invalid pwd 	
			
	return d1;
}
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	FileInputStream fs = new FileInputStream("C:\\Users\\geeta\\eclipse-workspace\\FirstProject\\test-output\\ExcelSheet\\AmazonTestData.xlsx");
	Workbook wb = WorkbookFactory.create(fs);
	
	String UN1= wb.getSheet("LoginDetails").getRow(0).getCell(0).getStringCellValue(); 
	 System.out.println("The userName1 is email:->" + UN1);
	 
	 String PWD1 = NumberToTextConverter.toText(wb.getSheet("LoginDetails").getRow(1).getCell(0).getNumericCellValue());
	 System.out.println("The username2 is Mobile:->"+ PWD1);
	 
	 String UN2= wb.getSheet("LoginDetails").getRow(0).getCell(0).getStringCellValue(); 
	 System.out.println("The userName1 is email:->" + UN2);
	 
	 String PWD2 = NumberToTextConverter.toText(wb.getSheet("LoginDetails").getRow(1).getCell(0).getNumericCellValue());
	 System.out.println("The username2 is Mobile:->"+ PWD2);
	 
	 
}
  
}
