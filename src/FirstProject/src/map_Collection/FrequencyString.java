package map_Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FrequencyString {

	public static void main(String[] args) {
		Map <Character,Integer> m1 = new HashMap<Character,Integer> ();
		
		String input  = "Rudra";
		
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
		
  for(Entry <Character,Integer> s1 : m1.entrySet())
  {
	  System.out.println("Character:" + s1.getKey() + " & Frequency : "+ s1.getValue());
  }
	}

}
