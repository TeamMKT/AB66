package Collection_framework_practice;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Practice_11 
{
   public static void main(String[] args) 
   {
	   Map<Integer, String> m1 = new HashMap <Integer, String>();
       m1.put(101, "Ramu");
       m1.put(102, "Ramu");
       m1.put(103, "Raju");
       m1.put(104, "Ravi");
       System.out.println("Before sorthing:" +m1);
       TreeMap<Integer,String> sortedMap = new TreeMap<>(m1);
       System.out.println("After sorting:" + sortedMap);
       
}
}
