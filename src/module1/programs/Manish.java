package module1.programs;

import java.util.Scanner;

public class Manish 
{
	public static void main(String[] args) 
	{
	//	Scanner s1=new Scanner();//it is calling the non parametruized cons of Scanner Class

Scanner s1=new Scanner(System.in);//it is now calling the paramtetrized cons
//of Scannr class
	System.out.print("Please enter the value of A:");
	int a=	s1.nextInt();
	System.out.print("Please enter the value of B:");
	int b=	s1.nextInt();
	
	int c=a*b;
	System.out.print("Answer:");
	System.out.println(c);

	s1.close();	
	
		
		
	}
}
