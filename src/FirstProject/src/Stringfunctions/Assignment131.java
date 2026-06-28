package Stringfunctions;
//Write A Program to check if the given string is a Palindrome?
public class Assignment131 
{
	public static void main(String[] args)
	{
		String name = "ROTATOR";
		String reverse = "";
		for(int i= name.length()-1;i>=0;i--)
		{
			char c1 = name.charAt(i);
			reverse = reverse+c1;
		}
		System.out.println("The input name is:- >"+name);
		System.out.println("The reverse name is :->"+reverse);
		if(name.equals(reverse))
		{
			System.out.println("This is  a palindrome");
		}
		else
		{
			System.out.println("This is not a palindrome");
		}
	}

}
