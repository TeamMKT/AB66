package Stringfunctions;

import java.util.Arrays;

public class TwoArraysareequal {

	public static void main(String[] args) 
	{
		int [] input = new int[5];
		input[0]=45;
		input[1]=25;
		input[2]=15;
		input[3]=5;
		input[4]=35;
		int [] output=new int[input.length];
		for(int i=0; i<input.length;i++)
		{
			output[i]=input[i];
		}
        System.out.println("Input Array is:->"+Arrays.toString(input));
        System.out.println("Output Array is:->"+Arrays.toString(output));
       boolean b1=Arrays.equals(input, output);
       if(b1==true)
       {
    	   System.out.println("The two arrays are equal");
       }
       else
       {
    	   System.out.println("The two arrays are not equal");
       }
        
	}

}
