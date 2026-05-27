package moduel3;

import java.util.HashMap;
import java.util.Map;

public class MapBehavior3 
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

		System.out.println(m1);
		Map<Integer,String> m2=	new HashMap<Integer,String>();
		m2.put(9632, "Abc");
		m2.put(8520, "Bcd");
		m2.put(7452, "Cde");
		m2.put(9630, "Def");
		System.out.println(m2);
		
		String name=	m2.get(8520);
		System.out.println(name);
		//m1.clear();
		m1.remove(9657);
		m1.remove(4500, "Arpann");

		
		
		m1.replace(4322,"Soni");
		m1.replace(4521, "Abhirup", "Anu");
		System.out.println("Updated M1=> "+m1);
		
		
	

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