package DataProvider_testNGAnnotations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class StepsToFetchtheValue {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fs = new FileInputStream("C:\\Users\\geeta\\eclipse-workspace\\FirstProject\\test-output\\ExcelSheet\\AmazonTestData.xlsx");
		Workbook wb = WorkbookFactory.create(fs);
		Sheet s1 = wb.getSheet("LoginDetails");
		  Row r1 = s1.getRow(0);
		 Cell c1= r1.getCell(0);
		 String UN = c1.getStringCellValue();
		 System.out.println("The userName is:->" + UN);
         /*String UN = wb.getSheet("LoginDetails").getRow(0).getCell(0).getStringCellValue();
         System.out.println("The userName is:->" + UN);*/  //ShortMehtod.
		 
		String PWD =  wb.getSheet("LoginDetails").getRow(0).getCell(1).getStringCellValue();
		System.out.println("The Password is:->"+PWD);
		
		 
		
		  

	}

}
