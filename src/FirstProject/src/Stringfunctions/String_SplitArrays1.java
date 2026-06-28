package Stringfunctions;

import java.util.Arrays;

public class String_SplitArrays1
{
	public static void main(String[] args) 
	{
		String name = "Automation Testing SDET";
		String [] s1 = name.split(" ");
		String [] s2 = name.split(" ",3);
		System.out.println(Arrays.toString(s1));
		System.out.println(Arrays.toString(s2));
	}

}
