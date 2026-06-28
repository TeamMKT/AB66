package map_Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Mapmethod3 
{
  public static void main(String[] args) 
  {
	Map <Character,Integer> m1 = new HashMap<>();
	String input = "Krishna";
	for(char ch : input.toCharArray())
	{
		if(m1.containsKey(ch))
		{
			m1.put(ch, m1.get(ch)+1);
		}
		else
		{
			m1.put(ch, 1);
		}
	}
	for(Entry <Character,Integer> e1 : m1. entrySet())
	{
		System.out.println("Character:" + e1.getKey() + "& Frequency :"+ e1.getValue());
	}
	
	
}
}
