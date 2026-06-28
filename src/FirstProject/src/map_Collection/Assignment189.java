package map_Collection;

import java.util.HashMap;
import java.util.Map;

//Write a Program iwith different functions of Map
public class Assignment189 
{
 public static void main(String[] args) 
 {
	Map <Integer,String> m1 = new HashMap<Integer, String>();
	m1.put(2294, "Geeta");
	m1.put(2294, "Vineela");
	m1.put(2296, "Uma");
	m1.put(2297, "Raju");
	m1.put(2298, "Sudhakar");
	System.out.println(m1);
	String s1 =m1.putIfAbsent(2297, "Ramu");
	System.out.println(m1);//it will give  same map, because, key is an unique value, it does notaccept duplicate values
	m1.putIfAbsent(2299, "Raju");
	System.out.println(m1);//here, key is no existing, so it will be added in the map.key is absent.
	
	
}
}
