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

public class For_Loop {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fs = new FileInputStream("C:\\Users\\geeta\\eclipse-workspace\\FirstProject\\test-output\\ExcelSheet\\AmazonTestData.xlsx");
		Workbook wb = WorkbookFactory.create(fs);
		Sheet s1 = wb.getSheet("LoginDetails");
		 int totalRows = s1.getLastRowNum();
		 int totalCells = s1.getRow(0).getLastCellNum();
		 
		 System.out.println(totalRows);
		 System.out.println(totalCells);
		
		for(int i=0;i<2;i++)//i means row
		{
			for(int j=0;j<2;j++)//j means CEll or Column
			{
				try
				{
					String UN1= wb.getSheet("LoginDetails").getRow(i).getCell(j).getStringCellValue();
					//this line gives the exception so wwe can try block
					System.out.println("USername UN1 is:" + UN1);
					
					/*String PWD1 =  wb.getSheet("LoginDetails").getRow(i).getCell(j).getStringCellValue();
					System.out.println("The Password is:->"+PWD1);*/
				}
				catch(IllegalStateException e1)
				{
					String UN2 = NumberToTextConverter.toText(wb.getSheet("LoginDetails").getRow(i).getCell(j).getNumericCellValue());
					System.out.println("USername is UN2:" + UN2);
					
					
				}
				

			}
		}
		
   wb.close();
   fs.close();
	}

}
