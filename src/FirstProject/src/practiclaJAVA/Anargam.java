package practiclaJAVA;

import java.util.Arrays;

public class Anargam 
{
   public static void main(String[] args) 
   {
	   String a = "cat";
	   String b = "act";
	   if (a.length()!=b.length())
	   {
		   System.out.println("The words are not anargam");
	   }
	   else
	   {
		   char[]c1= a.toCharArray();
		   char [] c2 = b.toCharArray();
		   Arrays.sort(c1);
		   Arrays.sort(c2);
		   System.out.println(Arrays.toString(c1));
		   System.out.println(Arrays.toString(c2));
		   if(Arrays.equals(c1, c2))
		   {
			   System.out.println("yes, they are anrgam");
		   }
		   else
		   {
			   System.out.println("no, they are not anargam");
		   }
	   }
	   
	   
}
   
	   
}
