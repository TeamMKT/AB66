package practiclaJAVA;

import java.util.Arrays;

public class Practice3 
{
   public static void main(String[] args)
   {
	String s1 = "Geeta";
	char [] c1 = s1.toCharArray();
	for(int i=0;i<s1.length();i++)
	{
		System.out.println(c1[i]);
	}
	System.out.println(Arrays.toString(c1));
	
}
}
