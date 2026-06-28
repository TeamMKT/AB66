package Collection_framework_practice;

import java.util.HashMap;
import java.util.Map;

public class Practice_8 
{
	public static void main(String[] args)
	   {
		  Map<Integer, String> m1 = new HashMap <Integer, String>();
	       m1.put(101, "Ramu");
	       m1.put(102, "Ramu");
	       m1.put(103, "Raju");
	       m1.put(104, "Ravi");
	       System.out.println(m1);
	        System.out.println(m1.remove(104));
	        System.out.println(m1);
	        
	        
	       for( String s1 : m1.values())
	       {
	    	   System.out.println(s1);
	       }
	    	   
	    	   
	       
}
	
}
	
