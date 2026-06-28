package Stringfunctions;
//Write a program to showcase all the replace string function
public class Assignment154 
{
  public static void main(String[] args) 
  {
	String s1 = "rudra";
	String s2 = s1.replace('r', 'R');
	System.out.println(s2);
	String s3=s1.replace("rudra", "prasad");
	System.out.println(s3);
	System.out.println(s1.replaceAll("[a-z]", " XY "));
	
	
}
}
