package nestedIf;
//Enter a number If positive → check even or odd;Else → print negative number
import java.util.Scanner;

public class EvenOddnumber {

	public static void main(String[] args)
	{
      Scanner s1 = new Scanner(System.in);
      System.out.println("Enter a number");
      int number = s1.nextInt();
      if(number>=0)
      {
    	  System.out.println("The number is positive");
    	  if(number%2==0)
    	  {
    		  System.out.println("The number is even");
    	  }
    	  else
    	  {
    		  System.out.println("The number is odd");
    	  }
      }
      else
      {
    	  System.out.println("The number is negative");
      }
    	s1.close();  
      }
	}


