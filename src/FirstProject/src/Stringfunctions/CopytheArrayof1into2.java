package Stringfunctions;

import java.util.Arrays;

public class CopytheArrayof1into2 
{

	public static void main(String[] args) 
	{
		int [] input = new int[5];
		input[0]=4;
		input[1]=5;
		input[2]=6;
		input[3]=7;
		input[4]=8;
		int [] output = new int[input.length];
		for(int i=0;i<input.length;i++)
		{
			output[i]=input[i];
		}
       System.out.println("My orrriginal Array is:->" + Arrays.toString(input));
       System.out.println("My output is :-> "+ Arrays.toString(output) );
	}

}
