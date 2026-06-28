package array_String;

import java.util.Arrays;

public class ReverseArray_oneArray 
{
   public static void main(String[] args) 
   {
	  int [] input = new int [5];
	  input[0]=11;
	  input[1]=12;
	  input[2]=13;
	  input[3]=14;
	  input[4]=15;
	  int [] output = new int [input.length];
	  for(int i=0;i<input.length;i++)
	  {
		  output[i] = input [i];
	  }
	  System.out.println("Input Array is:" + Arrays.toString(input));
	  System.out.println("Output Array is : " + Arrays.toString(output));
}
}
