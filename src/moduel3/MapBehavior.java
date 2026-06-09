package moduel3;

import java.util.HashMap;
import java.util.Map;

public class MapBehavior 
{
	public static void main(String[] args) 
	{
	
		Map<Integer,String> m1=	new HashMap<Integer,String>();
		m1.put(4521, "Abhirup");
		m1.put(4152, "Nisha");
		m1.put(4599, "Vaibhav");
		m1.put(4322, "Abhimanyu");
		
		System.out.println(m1);
		m1.putIfAbsent(4322, "Manish");
		
		System.out.println(m1);

		
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