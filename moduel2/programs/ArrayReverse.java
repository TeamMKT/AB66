package moduel2.programs;

import java.util.Arrays;

public class ArrayReverse 
{
	public static void main(String[] args) 
	{
		int input[]=new int[4];
		input[0]=45;
		input[1]=0;
		input[2]=46;
		input[3]=75;
		
		int output[]=new int[input.length];
		//int output[]=new int[4];  both are same
		
	for(int i=0,j=input.length-1;i<input.length;i++,j--)
	{
		output[j]	=input[i];
	
	}
		System.out.println("Input ARray is -> "+Arrays.toString(input));
		System.out.println("Output ARray is-> "+Arrays.toString(output));
		
		
	}
}
