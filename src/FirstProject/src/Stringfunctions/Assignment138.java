package Stringfunctions;
//Write a Program to reverse an array 
import java.util.Arrays;
public class Assignment138
{
	public static void main(String[] args) 
	{
		int input[] = new int[5];
		input[0]=55;
		input[1]=58;
		input[2]=49;
		input[3]=76;
		input[4]=42;
		int output[]=new int[input.length];
		for(int i=0,j=input.length-1;i<input.length;i++,j--)
		{
			output[j]=input [i];
		}
        System.out.println("Input Array is : ->"+Arrays.toString(input));
        System.out.println("Reverse Array is:->"+Arrays.toString(output));
	}

}
