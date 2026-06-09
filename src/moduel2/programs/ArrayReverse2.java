package moduel2.programs;

import java.util.Arrays;

public class ArrayReverse2 
{
	public static void main(String[] args) 
	{
		int input[]=new int[4];
		input[0]=45;
		input[1]=0;
		input[2]=46;
		input[3]=75;
		
		int output[]=new int[input.length];
		
	for(int i=0;i<input.length;i++)
	{
		output[i]	=input[i];
	
	}
		System.out.println("Input ARray is -> "+Arrays.toString(input));
		System.out.println("Output ARray is-> "+Arrays.toString(output));
		
		
	//	boolean b1=	Arrays.equals(input, output);
	//	System.out.println(b1);
		if(Arrays.equals(input, output)==true)
		{
			System.out.println("The 2 arrays are EQUALS");
		}
		else
		{
			System.out.println("The 2 arrays are NOT EQUALS");
		}
		
		
		
	}
}
