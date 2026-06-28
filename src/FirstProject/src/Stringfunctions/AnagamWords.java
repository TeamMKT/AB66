
package Stringfunctions;
import java.util.Arrays;
public class AnagamWords 
{
	public static void main(String[] args) 
	{
		String a = "DOG";
		String b = "GOD";
		if(a.length()!=b.length())
		{
			System.out.println("They can never be Anagram");
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
        	System.out.println("Yes, They are Anagram");
        }
        else
        {
        	System.out.println("No, They are not Anagram");
        }
        
	}

}
