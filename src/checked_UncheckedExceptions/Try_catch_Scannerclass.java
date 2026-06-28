package checked_UncheckedExceptions;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_catch_Scannerclass 
{
  public static void main(String[] args) 
  {
	  try {
	Scanner s1 = new Scanner(System.in);
	System.out.println("Please Enter the Array Size:");
	int [] input = new int [(s1.nextInt())];
	input [0] = 102;
	input [1] = 108;
	input [2] = 210;
	input [3] = 456;
	System.out.println(Arrays.toString(input));
	  }
	  catch(ArrayIndexOutOfBoundsException a1)
	  {
		  System.out.println("Please check the size of the Array");
	  }
	  catch(NegativeArraySizeException a1)
	  {
		  System.out.println("Please make sure that size should not be negative number");
	  }
	  catch(InputMismatchException a1)
	  {
		  System.out.println("Please make sure that your Array size should only be a number");
	  }
	
	
	
}
  
}
