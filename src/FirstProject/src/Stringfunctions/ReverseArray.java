package Stringfunctions;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) 
	{
		int [] input = new int [5];
		input[0]=45;
		input[1]=54;
		input[2]=65;
		input[3]=56;
		input[4]=75;
		int [] output = new int[input.length];//int output[]=new int[5];
		for(int i=0,j=input.length-1;i<input.length;i++,j--)
		{
			output [j] = input[i];
		}
        System.out.println("Input Array is:->" + Arrays.toString(input));
        System.out.println("Output Array is:->"+ Arrays.toString(output));
        
	}

}
