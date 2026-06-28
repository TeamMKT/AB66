package Stringfunctions;

public class Palindrom 
{
	public static void main(String[] args) 
	{
		String a= "LEVEl";
		System.out.println(a.length());
		String reverse="";
		for(int i=a.length()-1;i>=0;i--)
		{
			char c1 = a.charAt(i);
			reverse=reverse+c1;
			
		}
		System.out.println(reverse);
		if(a.equals(reverse))
		{
			System.out.println("This is a palindrome");
		}
		else
		{
			System.out.println("This is not a palindrome");
		}
	}

}
//here, the string name is palindrome, but case sensitive so its not a palidrome.