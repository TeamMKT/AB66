package moduel2.programs;

import java.util.ArrayList;
import java.util.List;

public class ListProperty3 
{
	public static void main(String[] args) 
	{
		List<String> l1=	new ArrayList<String>();
		//upcasting
		l1.add("Arpann");
		l1.add("Arbaaz");
		l1.add("Eugene");
		l1.add("Gaurav");
		l1.add("Arun");
		System.out.println(l1);
		
		boolean b1=	l1.contains("Manish");
		System.out.println(b1);
		List<String> l2=	new ArrayList<String>();
		//upcasting
		l2.add("Divya");
		l2.add("Anu");
		l2.add("Pooja");
		l2.add("Puja");
		l2.add("Nishant");
		System.out.println(l1);
		l1.addAll(l2);
		boolean b2=	l1.containsAll(l2);
		System.out.println(b2);	
			
		/*Indexing=true
		 * Order of insertion:true
		 * Duplicate:true
		 * Null:true
		 * dynamic: true
		 * Iterator:True
		 * ListIterator:true
		 * Enumeration:False
		 */

		
	}
}


