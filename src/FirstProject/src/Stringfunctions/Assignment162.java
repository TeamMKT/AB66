package Stringfunctions;
import java.util.Arrays;
//Write a program to Check whether two strings are anagrams using sort and equals in Java.
public class Assignment162 {
	public static void main(String[] args) 
	{
		String s1 = "dog";
		String s2 = "god";
		if(s1.length() != s2.length())
		{
			System.out.println("The two words never anagram");
		}
		else
		{
			char [] c1 = s1.toCharArray();
			char [] c2 = s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));
			if(Arrays.equals(c1, c2))
			{
				System.out.println("The two words are Anagram");
			}
			else
			{
				System.out.println("The two words are not Anagram");

			}
			
			
		}
	}

}
