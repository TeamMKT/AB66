package moduel2.programs;

import java.util.Arrays;

public class StringClassp 
{
	public static void main(String[] args) 
	{
		String a="manish tiwari";
		//     [a,u,t,o]=>Array
		//      0 1 2 3
		
		char [] c1=	a.toCharArray();
			
		for(int i=0;i<a.length();i++)
		{
		System.out.println(c1[i]);
		}
		System.out.println(Arrays.toString(c1));
	}
}
