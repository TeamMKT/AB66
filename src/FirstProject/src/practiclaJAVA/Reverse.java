
package practiclaJAVA;

import java.util.Arrays;

public class Reverse
{
     public static void main(String[] args) 
     {
	   int [] input = new int [5];
	   input [0]=10;
	   input [1]=20;
	   input [2]=30;
	   input [3]=40;
	   input [4]=50;
	   
	    int [] output = new int [input.length];
	    for(int i=0, j=input.length-1;i<input.length;i++,j--)
	    {
	    	output [j] = input [i];
	    }
	    System.out.println("Input Array is:" + Arrays.toString(input));
	    System.out.println("Outpur Array is:" + Arrays.toString(output));
 }
}
