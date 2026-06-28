package Collection_framework_practice;

import java.util.HashMap;
import java.util.Map;

public class Practise_6 
{
   public static void main(String[] args)
   {
	  Map<Integer, String> m1 = new HashMap <Integer, String>();
       m1.put(101, "Ramu");
       m1.put(102, "Ramu");
       m1.put(103, "Raju");
       m1.put(101, "Ravi");
       System.out.println(m1);
       if(m1.containsKey(101))
       {
    	   System.out.println("Key 101 exist in a Map");
       }
       else
       {
    	   System.out.println("Key 101 not exist in a Map");
       }
   }
}
