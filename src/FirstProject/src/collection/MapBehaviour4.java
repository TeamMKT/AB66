package collection;

import java.util.HashMap;
import java.util.Map;

public class MapBehaviour4
{
   public static void main(String[] args) 
   {
	  Map<Integer,String> m1 = new HashMap<Integer,String>();
	  m1.put(4521, "Anu");
	  m1.put(4152, "Raju");
	  m1.put(4539, "Vineela");
	  m1.put(4322, "Rudra");
	  System.out.println(m1);
	 Map<Integer,String> m2 = new HashMap <Integer,String>();
	 m2.put(9632, "Abc");
	 m2.put(8520, "Bcd");
	 m2.put(7452, "Cde");
	 m2.put(9630, "Def");
	 System.out.println(m2);
	 String name=m2.get(8520);
	 System.out.println(name);
	 m1.remove(4152);
	 m1.remove(4322, "Rudra");
	 System.out.println("Updated m1: " + m1);
	 m1.replace(4539, "Uma");
	 System.out.println("Updated m1: " + m1);
	 m1.replace(4521, "Anu", "Ravi");
	 System.out.println("Updated m1: " + m1);
	 m1.replace(4539, "Uma", "Sharma");
	 System.out.println("Updated m1: " + m1);
	 
	 

	 
	 
}
}
