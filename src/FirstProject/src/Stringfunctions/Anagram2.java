package Stringfunctions;
import java.util.Arrays;
public class Anagram2 {
	public static void main(String[] args) 
	{
         String a = "HEART";
         String b = "EARTH";
         if(a.length()!=b.length())
         {
        	 System.out.println("The two words are never Anagram Words");
         }
         else
         {
        	 
         }
         char [] c1 = a.toCharArray();
         char [] c2 = b.toCharArray();
         Arrays.sort(c1);
         Arrays.sort(c2);
        System.out.println(Arrays.toString(c1));
        System.out.println(Arrays.toString(c2));
         if(Arrays.equals(c1, c2))
         {
        	 System.out.println("Yes, the words are Anagram");
         }
         else
         {
        	 System.out.println("No, the words are not Anagram");
         }
	}

}
