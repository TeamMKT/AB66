package Stringfunctions;
//"Write a program to Check if the given string ends with 'e', string"axe"
public class Assignment149
{
public static void main(String[] args) 
{
	String s1 = "axe";
	boolean b1=s1.matches("(.*)e");
	System.out.println(b1);
	if(s1.endsWith("e"))
	{
		System.out.println("the given string ends with 'e'");
	}
	else
	{
		System.out.println("the given string not ends with 'e'");

	}
}
}
