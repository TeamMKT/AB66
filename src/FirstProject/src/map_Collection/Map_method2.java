package map_Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Map_method2 
{
  public static void main(String[] args)
  {
	  Map <Integer,String> m2 = new HashMap <Integer,String> (); 
	    m2.put (2356,"Roma");
	    m2.put (2357,"rudra");
	    m2.put (2358,"ravi");
	    m2.put (2359,"geeta");
	     
	    String s1  = m2.get(2356);
	    System.out.println(s1);
	    boolean b1 = m2.containsKey(2356);
	    System.out.println(b1);
	    int i  = m2.size();
	    System.out.println(i);
	    
	    boolean b = m2.isEmpty();
	    System.out.println(b);
	    
	   boolean b2  = m2.containsValue("geeta");
	   System.out.println(b2);
	    
	    Set <Entry<Integer,String>> s2 = m2.entrySet();
	    for(Entry<Integer,String> i1 : m2.entrySet())
	    {
	      System.out.println("Employee salary:"+ i1.getKey() + "& Employee name:" + i1.getValue());
	    }
}
}
