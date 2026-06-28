package Stringfunctions;
//Write A Program to check if String is Anagram
import java.util.Arrays;
public class Assignment146 
{
	public static void main(String[] args)
	{
		String a = "SAVE";
		String b = "VASE";
		if(a!=b)
		{
			System.out.println("The two words never be Anagram");
		}
		else
		{
			
		}
		char [] c1 = a.toCharArray();
		char [] c2 = b.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		if(Arrays.equals(c1, c2))
		{
			System.out.println("Yes, they are anagram");
		}
		else
		{
			System.out.println("No,They are not anagram");
		}

	}

}
