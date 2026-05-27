package moduel3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapBehavior4 
{
	public static void main(String[] args) 
	{
	
		Map<Integer,String> m1=	new HashMap<Integer,String>();
		m1.put(4521, "Abhirup");
		m1.put(4152, "Nisha");
		m1.put(4599, "Vaibhav");
		m1.put(4322, "Abhimanyu");
		m1.put(9657, "Manish");
		m1.put(4500, "Arpann");
		
		
		Set<Integer> s1=	m1.keySet();
		
		Collection<String> c1=	m1.values();
		
		Set<Entry<Integer,String>> d1=	m1.entrySet();
		System.out.println("Iterating the keys using KeySet:");
		//for each loop
		for(Integer i1    : m1.keySet()    ) 
		{
			System.out.println(i1);
		}
		System.out.println("Iterating the values using Values:");
		for( String s2        :      m1.values())
		{
			System.out.println(s2);
		}
		System.out.println("Iterating the PAIRS key and value using ENtrySet:");
		for(Entry<Integer,String> s3 :  m1.entrySet())
		{
			System.out.println(s3);
		}
		
	}
}
/*
Tata SKy:
SIM:
Bank Account:
Amazon prime
Gas Connection:
Zoom Subs
Key and value:

*/