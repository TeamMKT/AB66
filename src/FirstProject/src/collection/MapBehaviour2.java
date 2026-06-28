package collection;

import java.util.HashMap;

import java.util.Map;

public class MapBehaviour2 
{
   public static void main(String[] args) 
   {
	  Map <Integer,String> m1 = new HashMap<Integer,String>();
	  m1.put(4521, "Anu");
	  m1.put(4152, "Raju");
	  m1.put(4539, "Vineela");
	  m1.put(4322, "Rudra");
	  System.out.println(m1);
	  Map <Integer,String> m2 = new HashMap <Integer,String>();
		 m2.put(9632, "Abc");
		 m2.put(8520, "Bcd");
		 m2.put(7452, "Cde");
		 m2.put(9630, "Def");
		 System.out.println(m2);
		 m1.putAll(m2);
		 System.out.println(m1);
		 boolean b1=m1.equals(m2);
		 System.out.println(b1);
		 boolean b2 = m1.containsKey(4599);
		 System.out.println(b2);
		 boolean b3= m1.containsValue("Nisha");
		 System.out.println(b3);
		 
	}
}
