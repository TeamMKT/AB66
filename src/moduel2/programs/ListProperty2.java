package moduel2.programs;

import java.util.ArrayList;
import java.util.List;

public class ListProperty2 
{
	public static void main(String[] args) 
	{
		List<String> l1=	new ArrayList<String>();
		//upcasting
		l1.add("Arpann");
		l1.add("Arbaaz");
		l1.add("Eugene");
		l1.add("Gaurav");
		l1.add("Gaurav");
		l1.add(null);
		l1.add(null);
		l1.add("Arun");
		System.out.println(l1);
		
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


