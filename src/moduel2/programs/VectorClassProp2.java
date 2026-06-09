package moduel2.programs;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorClassProp2 
{
	public static void main(String[] args) 
	{
		Vector<String> v1=new Vector<String>();
		v1.addElement("gaurav");
		v1.addElement("ishwarya");
		v1.addElement("geeta");
		System.out.println(v1);
		
		Iterator<String> products=	v1.iterator();

		
		
		ListIterator<String> products1=	v1.listIterator();
							
		Enumeration<String> e1=			v1.elements();
		System.out.println("Iteration using Iterator:");
		while(e1.hasMoreElements())
			{
				System.out.println(e1.nextElement());
			}
	/*Syntax:
	 * 	methods
	 * only forward iteration
	 * remove->NO
	 * Set>No
	 */
	
	}
}
