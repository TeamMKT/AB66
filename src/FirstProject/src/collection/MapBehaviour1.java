package collection;

import java.util.HashMap;
import java.util.Map;

public class MapBehaviour1 
{
   public static void main(String[] args) 
   {
	  Map <Integer,String> m1 = new HashMap<Integer,String>();
	  m1.put(4521, "Anu");
	  m1.put(4152, "Raju");
	  m1.put(4539, "Vineela");
	  m1.put(4322, "Rudra");
	  System.out.println(m1);
	 
	  m1.putIfAbsent(4322, "Geeta");
	  System.out.println(m1);
	  m1.putIfAbsent(5167, "Geeta");
	  System.out.println(m1);
}
}
