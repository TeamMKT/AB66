package array_String;

import java.util.Arrays;

public class Array_Reverse 
{
   public static void main(String[] args) 
   {
	 int [] input = new int [4];
	 input [0] =45;
	 input [1] =55;
	 input [2] =46;
	 input [3] =47;
	 int [] output = new int[input.length];
		 for(int i=0,j=input.length-1;i<input.length;i++,j--)
	 {
		 output [j] = input [i];
	 }
        System.out.println("My input Array is:" + Arrays.toString(input));
        System.out.println("My reverse Array is:" + Arrays.toString(output));
	 }
}
