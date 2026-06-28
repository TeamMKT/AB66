package map_Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Method 
{
   public static void main(String[] args)
   {
	  Map <Integer, String> m1 =  new HashMap <Integer,String> ();
	  m1.put(123, "Geeta");
	  m1.put(246, "rudra");
	  m1.put(257, "ravi");
	  m1.put(268, "vineela");
	  
	 System.out.println(m1);
	 
	 m1.putIfAbsent(268, "manish");
	 System.out.println(m1);
	 m1.putIfAbsent(657,"Geeta");
	 System.out.println(m1);
	 
	String s1=  m1.get(123);
	System.out.println(s1);
	
	Set <Integer> a1    = m1. keySet();
	Collection <String>  a2 = m1. values();
	Set<Entry<Integer,String>> a3 = m1.entrySet();
	
	for(Integer i1 : m1.keySet())
	{
		System.out.println("Print the Keys in m1:" + i1);
	}
	
	for(String i2 : m1.values())
	{
		System.out.println("Print the values of a string:"+i2);
	}
	for(Entry<Integer,String> i3 : m1.entrySet())
	{
		System.out.println("entrySet:" + i3.getKey() + "  &  EntryValue:"+ i3.getValue());
	}
   }
}
	
	
		
	
	
	  

