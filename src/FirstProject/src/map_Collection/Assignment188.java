package map_Collection;
import java.util.Collection;
//Write a Program to iterate a Map
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class Assignment188 
{
   public static void main(String[] args) 
   {
	Map <Integer,String> m1 = new HashMap<Integer,String>();
	m1.put(2294, "Geeta");
	m1.put(2295, "Vineela");
	m1.put(2296, "Uma");
	m1.put(2297, "Raju");
	m1.put(2298, "Sudhakar");
	System.out.println(m1);
			 Set <Entry<Integer,String>> d1=m1.entrySet();
			 System.out.println("Iterating the Paris key and value using Entry Set:");
			 for (Entry<Integer,String > i3: m1.entrySet())
			 {
				 System.out.println(i3);
			 }
   }
}
