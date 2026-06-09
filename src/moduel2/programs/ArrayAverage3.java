package moduel2.programs;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayAverage3 
{
	public static void main(String[] args) 
	{
		try {
			Scanner s1=new Scanner(System.in);
			System.out.println("Please enter the size of Array:");
		int [] input=new int[s1.nextInt()];
		input[0]=96;
		input[1]=86;
		input[2]=100;
		input[3]=90;
		System.out.println(Arrays.toString(input));
		}
		catch(ArrayIndexOutOfBoundsException a1)
		{
			System.out.println("PLease check your array size");
		}
		catch(NegativeArraySizeException a1)
		{	
			System.out.println("Please make sure that size of your array should not be a negative number");
		}
		catch(InputMismatchException a1)
		{	
			System.out.println("PLease make sure the size of your should only be a number");
		}
	}
}
