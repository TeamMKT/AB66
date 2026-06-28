package array_String;

import java.util.Arrays;

public class String_Array 
{
  public static void main(String[] args)
  {
	String str = "String Testing";
	char [] c1 =str.toCharArray();
	
	System.out.println(Arrays.toString(c1));
	for(int i=0;i<=str.length()-1;i++)
	{
		System.out.println(c1[i]);
	}
	
}
}
