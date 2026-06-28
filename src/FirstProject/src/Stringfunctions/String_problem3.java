package Stringfunctions;
public class String_problem3 
{
  public static void main(String[] args)
  {
	String name = "Ramu Karri";
	System.out.println(name.length());
	System.out.println(name.charAt(2));
	System.out.println(name.indexOf('K'));
	for (int i=0;i<name.length();i++)
	{
		System.out.println(name.charAt(i));
	}
	for ( int i=5; i<name.length()-1;i++)
	{
		System.out.println(name.charAt(i));
	}
}
}
