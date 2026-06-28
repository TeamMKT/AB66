package package1;
//Write a program to check months of the year using scanner class in switch concept.
import java.util.Scanner;
public class Assignment65 
{
public static void main(String[] args) 
{
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter a month name");
	String month=s1.next();
	switch(month)
	{
	  case "January":
	     System.out.println("First month of the Year");
	     break;
	  case "February":
		   System.out.println("Second Month of the Year");
		   break;
	  case "May":
		   System.out.println("Summer vaccation");
		   break;
	  case "August":
		   System.out.println("Independence day");
		   break;
	  case "October":
		   System.out.println("Dassara vaccation");
		   break;
	  case "December":
		  System.out.println("Ending month of the Year");
		  break;
	}
	s1.close();
		    
		  
		   
	}
		

	}


