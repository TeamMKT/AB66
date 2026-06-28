package Stringfunctions;
//Write a program for Reverse a String by using String Functions
public class Assignment128 {

	public static void main(String[] args)
	{
		String name = "Rudra";
		System.out.println("length of name :->" + name.length());
		String reverse="";
		for(int i=name.length()-1;i>=0;i--)
		{
			char c1= name.charAt(i);
			reverse = reverse+c1;
		}
      System.out.println(reverse);
	}

}
