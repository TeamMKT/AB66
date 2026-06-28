package array_String;

import java.util.Arrays;

public class Practise_ToCharArray 
{
   public static void main(String[] args) 
   {
	  String str = "Manish Tiwari";
	 char [] c1 = str.toCharArray();
	 for(int i=0;i<=str.length()-1;i++)
	 {
		 System.out.println(c1[i]);
	 }
	 System.out.println(Arrays.toString(c1));
	
}
}
