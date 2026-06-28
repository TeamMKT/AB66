package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

/*"Write a difference between 3 types of cursor; 1.Enumeration 
2.Iterator 3.ListIterator"*/
public class Assignment184
{
  public static void main(String[] args) {
	Vector <String> v1 = new <String> Vector();
	v1.add("Rudra");
	v1.add("Ramu");
	v1.add("Geeta");
	System.out.println(v1);
	
	Enumeration < String> e1=v1.elements();
	System.out.println("Iteration using iterator");
	while(e1.hasMoreElements())
	{
		System.out.println(e1.nextElement());
	}
	
	Iterator < String> names =v1.iterator();
	while(names.hasNext())
	{
		System.out.println(names.next());
		
		if(names.equals("Geeta"))
		{
			 names.remove(); 
		}
		System.out.println(v1);
	}
	ListIterator < String> names1 =v1.listIterator();
	while(names1.hasNext())
	{
		System.out.println(names1.next());
	}
	while(names1.hasPrevious())
	{
	 System.out.println(names1.previous());
		if(names1.equals("Ramu"))
		{
			 names1.remove(); 
		}
		System.out.println(v1);
	}
	
	
	

	
	
	
	
}
}
