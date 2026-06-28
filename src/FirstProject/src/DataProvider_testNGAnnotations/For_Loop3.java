package DataProvider_testNGAnnotations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class For_Loop3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fs = new FileInputStream("C:\\Users\\geeta\\eclipse-workspace\\FirstProject\\test-output\\ExcelSheet\\AmazonTestData.xlsx");
		Workbook wb = WorkbookFactory.create(fs);
		
		for(int i=0; i<wb.getNumberOfSheets(); i++)
		{
		    System.out.println("Sheet " + i + " = " + wb.getSheetName(i));
		}
		  Sheet sheet = wb.getSheet("SeacrchingProducts");
		
		  int totalRows = sheet.getLastRowNum();
		int totalCells = sheet.getRow(0).getLastCellNum();
		
		System.out.println(totalRows);
		 System.out.println(totalCells);
		 for(int i=0;i<=totalRows;i++)
		 {
		     Row r = sheet.getRow(i);

		     if(r != null && r.getCell(0) != null)
		     {
		         System.out.println(r.getCell(0).toString());
		     }
		 }
		 
		/*for(int i=0;i<=10;i++)//i means row
		{
			   /*Row r = sheet.getRow(i);	
			String s1= r.getCell(0).toString();*/
			/*String s1= wb.getSheet("SeacrchingProducts").getRow(i).getCell(0).getStringCellValue();
				System.out.println(s1);		
		}*/
		

	}

}
