package DataProvider_testNGAnnotations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class StudentDetails {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	 FileInputStream fs = new FileInputStream("C:\\Users\\geeta\\eclipse-workspace\\FirstProject\\test-output\\ExcelSheet\\AmazonTestData.xlsx");
            Workbook wb = WorkbookFactory.create(fs);
            Sheet sheet = wb.getSheet("StudentAttandance");
            for(int i=0 ; i<6;i++)
            {
            	for(int j=0;j<2;j++)
            	{
            		try
            		{
            			String name = wb.getSheet("StudentAttandance").getRow(i).getCell(j).getStringCellValue();
                		System.out.println(name);
            		}
            		catch(IllegalStateException e1)
            		{
            			String rollno = NumberToTextConverter.toText(wb.getSheet("StudentAttandance").getRow(i).getCell(j).getNumericCellValue());
            			 System.out.print( rollno +  "   & ");
            		}
            	}
            }
            	
            
            
	}

}
