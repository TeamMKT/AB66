package Collection_framework_practice;

import java.util.HashMap;
import java.util.Map;

public class practice_7
{
	public static void main(String[] args)
	   {
		  Map<Integer, String> m1 = new HashMap <Integer, String>();
	       m1.put(101, "Ramu");
	       m1.put(102, "Ramu");
	       m1.put(103, "Raju");
	       m1.put(101, "Ravi");
	       System.out.println(m1);
	       for( Integer s1   : m1.keySet())
	       {
	    	   System.out.println(s1);
	       }
	       
}
}