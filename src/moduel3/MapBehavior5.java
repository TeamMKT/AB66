package moduel3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapBehavior5 
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
		
			Set<Entry<Integer,String>> d1=	m1.entrySet();
			Iterator<Entry<Integer,String>>	u1=d1.iterator();
			while(u1.hasNext())
			{
				System.out.println(u1.next());
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