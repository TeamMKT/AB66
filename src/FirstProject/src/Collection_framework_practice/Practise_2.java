package Collection_framework_practice;


import java.util.HashMap;
import java.util.Map;


public class Practise_2 
{
    public static void main(String[] args)
    {
    Map <Integer,String> m1 = new HashMap <Integer,String> ();
    m1.put(11, "Ramu");
    m1.put(12, "Rudra");
    m1.put(13, "Ravi");
    m1.put(14, "Roja");
    for( Map.Entry < Integer, String> s1: m1.entrySet())
    	
     {
      System.out.println("Student ID:" + s1.getKey()+ " & Name:" + s1.getValue());

      }
 
	}
	
	
	
}
