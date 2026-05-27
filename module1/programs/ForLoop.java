package module1.programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;

public class ForLoop 
{
	public static void main(String[] args) throws InterruptedException, MalformedURLException, FileNotFoundException 
	{
		FileInputStream fs=new FileInputStream("E:\\MKTProject\\AutomationBatch64\\target\\ExcelSheet\\manish.xlsx");
		
		URL u1=new URL("https://www.google.com");
		for(int i=0;i<100;i++)
		{
			System.out.println(i);
			Thread.sleep(2000);
		}
		System.out.println("End of the For loop");
		
	}
}
