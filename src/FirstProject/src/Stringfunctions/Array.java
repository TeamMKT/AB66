package Stringfunctions;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		
		int input[]=new int[4];
		input[0]=45;
		input[1]=47;
		input[2]=57;
		input[3]=68;
		int output[]=new int[input.length];
		for (int i=0,j=input.length-1; i<input.length;i++,j--)
		{
			output[j]=input[i];
			System.out.println(input[i]);
			
			System.out.println(output[j]);

		}

	}

}
