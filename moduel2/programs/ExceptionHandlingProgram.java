package moduel2.programs;
import java.util.Scanner;
public class ExceptionHandlingProgram 
{
	public static void main(String[] args) 
	{
	
	try {
		int c=1/1;//1 and 0 are coming from parnet and grandparent class
		System.out.println(c);
	}
	catch(Exception a1) 
	{
		System.out.println("Exception is handled");
	}
	finally
	{
		System.out.println("No matter what I will alwasy execute");
	}
	}
}
