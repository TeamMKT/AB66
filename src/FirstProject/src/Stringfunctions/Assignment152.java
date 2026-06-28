package Stringfunctions;

import java.util.Arrays;

// Write a program to split the given string "Automation Testing"
public class Assignment152 
{
 public static void main(String[] args) 
 {
	String s1 = "Automation Testing";
	String [] s2 = s1.split(" ");
	String [] s3 =s1.split(" ", 2);
	System.out.println(Arrays.toString(s2));
	System.out.println(Arrays.toString(s3));
}
}
