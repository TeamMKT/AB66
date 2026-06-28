package Stringfunctions;
//"Write a program to Check if the given strig consist of exact 3 letters string "axe"
public class Assignment147
{
   public static void main(String[] args) 
   {
	  String s1 = "axe";
	  if(s1.length()==3 && s1.equals("axe"))
	  {
		  System.out.println("String is exactly axe");
	  }
	  else
	  {
		  System.out.println("String is not axe");
	  }
}
}
