package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List1 
{
   public static void main(String[] args) 
   {
	List<String> i1 = new ArrayList<String>();
	i1.add("A");
	i1.add("B");
	i1.add("C");
	Iterator<String> i2 = i1.iterator();
	while(i2.hasNext())
	{
		if(i2.next().equals("B"))
		{
			i2.remove();
		}
	}
	System.out.println(i1);
}
}
