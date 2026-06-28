package practiclaJAVA;

import java.util.Arrays;

public class Anargam_3 {

	public static void main(String[] args) {
		 String s1 = "CAT";
	        String s2 = "ACT";
	        
	        if(s1.length() != s2.length())
	        {
	            System.out.println("THis is not a anargam");
	        }
	        else
	        {
	            char [] c1= s1.toCharArray();
	                char [] c2 = s2.toCharArray();
	                Arrays.sort(c1);
	                Arrays.sort(c2);
	                System.out.println(Arrays.toString(c1));
	                System.out.println(Arrays.toString(c2));
	                if(Arrays.equals(c1,c2))
	                {
	                    System.out.println("Yes, they are Anagram");
	                }
	                else
	                {
	                    System.out.println("No, they are not Anagram");
	                }
	      
	        }
	                

	}

}
