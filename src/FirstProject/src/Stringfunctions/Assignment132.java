package Stringfunctions;
//Write A Program on String Function using toCharArray concept
import java.util.Arrays;

public class Assignment132 {

	public static void main(String[] args) 
	{
		String name ="Rudra";
		char [] c1 = name.toCharArray();
		for(int i= 0; i<name.length();i++)
		{
		  System.out.println(c1[i]);
		}
		System.out.println(Arrays.toString(c1));
	}

}
