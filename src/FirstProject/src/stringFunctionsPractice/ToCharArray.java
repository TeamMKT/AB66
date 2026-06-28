package stringFunctionsPractice;

import java.util.Arrays;

public class ToCharArray 
{
	public static void main(String[] args)
	{
		String name = "Geetajyothi";
		char [] c1 = name.toCharArray();
		for(int i=0;i<name.length();i++)
		{
			System.out.println(c1[i]);
		}
System.out.println(Arrays.toString(c1));
}
	
}
