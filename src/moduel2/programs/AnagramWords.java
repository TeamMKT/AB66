package moduel2.programs;

import java.util.Arrays;

public class AnagramWords
{
	public static void main(String[] args) 
	{
		String a="cat";
		String b="act";
		
		if(a.length()!=b.length())
		{
			System.out.println("They can Never be Anagram");
		}
		else
		{
			/*
			 * sort them: a=[a, c, t]
			 * sort them: b=[a, c, t]
			 */
			
			char [] c1=	a.toCharArray();
			char []c2=b.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));

			if(Arrays.equals(c1, c2))
			{
				System.out.println("Yes, They Are ANAGRAM");
			}
			else
			{
				System.out.println("No, They Are NOT ANAGRAM");

			}
			
		}
		
		
		
		
	}
}
