package package1;
//"Write a program to:Check if marks are valid (0–100)Then assign grade: A, B, C, or Fail using nested if and scanner class"
import java.util.Scanner;

public class Assignment66 
{
public static void main(String[] args)
{
	Scanner s1 =new Scanner(System.in);
	System.out.println("Enter marks");
	int marks=s1.nextInt();
	if(marks>=0 && marks<=100)
	{
		System.out.println("Valid marks");
		if(marks>=90)
		{
		 System.out.println("Grade A");
		}
		else
		{
		  if(marks>=75)
		    {
		    	System.out.println("Grade B");
		    }
		    else
		    {
		    	if(marks>=60)
		    	{
		    	  System.out.println("Grade C");
		        }
		      else
		         {
		    	 System.out.println("fail");
		         }
		    }
		}
	}
		 else
		 {
			 System.out.println("invalid marks");
		 }
		s1.close();
	}
	
	
	}


