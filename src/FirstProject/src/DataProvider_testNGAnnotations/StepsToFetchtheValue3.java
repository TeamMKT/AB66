package DataProvider_testNGAnnotations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class StepsToFetchtheValue3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fs = new FileInputStream("C:\\Users\\geeta\\eclipse-workspace\\FirstProject\\test-output\\ExcelSheet\\AmazonTestData.xlsx");
		Workbook wb = WorkbookFactory.create(fs);
		
		String UN1= wb.getSheet("LoginDetails").getRow(0).getCell(0).getStringCellValue(); //ShortMehtod.
		 System.out.println("The userName1 is email:->" + UN1);
		 
		 String PWD1 =  wb.getSheet("LoginDetails").getRow(0).getCell(1).getStringCellValue();
			System.out.println("The Password is:->"+PWD1);
		 
		 String UN2 = NumberToTextConverter.toText(wb.getSheet("LoginDetails").getRow(1).getCell(0).getNumericCellValue());
		 System.out.println("The username2 is Mobile:->"+ UN2);//we can use for number
		 
		String PWD2 =  wb.getSheet("LoginDetails").getRow(1).getCell(1).getStringCellValue();
		System.out.println("The Password is:->"+PWD2);
		

		
		 
		
		  

	}

}
