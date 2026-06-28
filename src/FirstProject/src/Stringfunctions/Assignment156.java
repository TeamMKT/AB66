package Stringfunctions;
//Write a program using append method in string buffer
public class Assignment156 
{
 public static void main(String[] args)
 {
	StringBuffer s1 = new StringBuffer("Rudra");
	StringBuffer s2 =s1.append("Prasad");
	System.out.println(s2);
	StringBuffer s3 =s2.append(" Sharma");
	System.out.println(s3);
	
}
}
