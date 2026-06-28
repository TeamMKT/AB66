package Stringfunctions;
//Write a program using append method in string builder
public class Assignment157 
{
  public static void main(String[] args)
  {
	StringBuilder s1 = new StringBuilder("Geeta");
	StringBuilder s2 =s1.append("Jyothi");
	System.out.println(s2);
	StringBuilder s3 = s2.append(" Meduri");
	System.out.println(s3);
}
}
