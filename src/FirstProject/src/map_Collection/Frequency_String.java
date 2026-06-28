package map_Collection;
//Write a program to count the frequency of characters in a String using HashMap.
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Frequency_String {

     
	public static void main(String[] args) 
	{
		

		Map <Character,Integer> m1  = new HashMap <Character,Integer> ();
		
		String input="java";
		for(char ch  : input.toCharArray())
		{
			if(m1.containsKey(ch))
			{
				m1.put(ch, m1.get(ch) + 1);
			}
			else
			{
				m1.put(ch, 1);
			}
		
		}
		
       for(Entry <Character,Integer> s1 : m1.entrySet())
       {
    	   System.out.println("The number of characters:" + s1.getKey() + "The number of values:" + s1.getValue() );
       }
  
}
}