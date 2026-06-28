package Stringfunctions;
//Write a Program to iterate each char present in a string          
import java.util.Arrays;           
public class Assignment163
{
	public static void main(String[] args) 
	{
		String s1 = "Geeta";
		char [] c1 = s1.toCharArray();
		
		for(int i=0;i<=s1.length()-1;i++)
		{
			System.out.println(s1.charAt(i));
		}
		System.out.println(Arrays.toString(c1));
	}

}
