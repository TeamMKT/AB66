package collection;

import java.util.HashMap;
import java.util.Map;

public class Mapbehaviour5 
{
  public static void main(String[] args)
  {
	Map <Integer, String> m1 = new HashMap<Integer,String>();
	m1.put(4521, "Anu");
	m1.put(4522, "Radha");
	m1.put(4523, "Aruna");
	m1.put(4524, "Aarti");
	m1.put(4525, "Aarti");
	System.out.println(m1);
	for(Map.Entry<Integer,String> s1 : m1.entrySet())
	{
		System.out.println("Employeed id:" + s1.getKey()+" & Name:" + s1.getValue() );
	}
	
}
}
