package stringBuffer;

/*Write a program to showcase that the concept of String is Immutable and the concept of StringBuffer 
and StringBuilder are mutable in nature.*/

public class StringBufferProgram 
{
	public static void main(String[] args) 
	{
	   StringBuffer s1 =new StringBuffer("Automation");
	  /* StringBuffer a = s1.append("Testing");//here, return type is String buffer
	   System.out.println(a);*/
	   s1.append("Testing");
	   System.out.println(s1);//This is mutable
	   
	   StringBuilder s2 = new StringBuilder("Automation");
	   /* StringBuilder a = s1.append("Testing");//here, return type is String builder
	   System.out.println(a);*/
	   s2.append("Testing");
	   System.out.println(s2);//This is mutable

	}

}
