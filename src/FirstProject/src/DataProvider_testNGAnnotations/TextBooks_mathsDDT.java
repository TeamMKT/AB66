package DataProvider_testNGAnnotations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class TextBooks_mathsDDT {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream fs = new FileInputStream("C:\\Users\\geeta\\eclipse-workspace\\FirstProject\\test-output\\ExcelSheet\\AmazonTestData.xlsx");
              Workbook wb = WorkbookFactory.create(fs);
              Sheet sheet = wb.getSheet("Books");
              
              /*int totalRows = sheet.getLastRowNum();
              int totalCells = sheet.getRow(0).getLastCellNum();
              
              System.out.println(totalRows);
              System.out.println(totalCells);*/
              
              for (int i=0;i<4;i++)
              {
            	  for(int j=0;j<4;j++)
            	  {
            		  try
            		  {
            			  String S1 = wb.getSheet("Books").getRow(i).getCell(j).getStringCellValue();
            			  System.out.println(S1);
            		  }
            		  catch(IllegalStateException e1)
            		  {
            			  String S2 = NumberToTextConverter.toText(wb.getSheet("Books").getRow(i).getCell(j).getNumericCellValue());
            			  System.out.println(S2);
            			  
            		  }
            	  }
              }
              
	}

}
