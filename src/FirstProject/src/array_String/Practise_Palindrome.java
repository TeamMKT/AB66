package array_String;

public class Practise_Palindrome 
{
	 public static void main(String[] args)
	 {
		 String s1 = "level";
	     String reverse ="";
	     System.out.println(s1.length());
	     for(int i=s1.length()-1;i>=0;i--)
	     {
	    	char c1 = s1.charAt(i);
	    	reverse = reverse+c1;
	     }
	     System.out.println(reverse);
	     System.out.println("My input is:" + s1);
         System.out.println("My output is: " + reverse);
         if(s1.equals(reverse))
         {
        	 System.out.println("This is a palindrome");
         }
         else
         {
        	 System.out.println("This is not a Palindrome");
         }
	    
	}
}

