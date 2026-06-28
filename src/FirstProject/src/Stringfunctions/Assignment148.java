package Stringfunctions;
//" Write a program to check if the given string starts with 'a',  string"axe"
public class Assignment148 
{
	public static void main(String[] args) 
	   {
		  String s1 = "axe";
		  boolean b1 = s1.matches("a(.*)");
		  System.out.println(b1);
		  if (s1.startsWith("a"))
		  {
			  System.out.println("String starts with the letter a");
		  }
		  else
		  {
			  System.out.println("String does not starts with the letter a");
		  }
		 
	   }
	
	
		  
}
