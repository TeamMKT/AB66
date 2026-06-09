package moduel2.programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListProgram5 
{
	public static void main(String[] args) 
	{
	
		ArrayList<Double> a1=new ArrayList<Double>();
		a1.add(963.96);
		a1.add(1000.7);
		a1.add(96.96);
		a1.add(92.96);
		a1.add(2.96);
		System.out.println(a1);
	
		Iterator<Double> i2=	a1.iterator();
		System.out.println("Iteration using Iterator:");
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		
		/*remove->remve the Object
		 * hasnext->boolean
		 * next->Object
		 * You can only do forward Iteration
		 * It is applicable to the entire Collection
		 */
		ListIterator<Double> i3=	a1.listIterator();
		
		System.out.println("FOrward Iteration using ListIterator:");

		while(i3.hasNext())
		{
			System.out.println(i3.next());
		}
		System.out.println("Backword Iteration using ListIterator:");

		while(i3.hasPrevious())
		{
			System.out.println(i3.previous());
		}
		/*hasnext->boolean
		 * hasprevious->->boolean
		 * next=object
		 * previous=object
		 * set
		 * remove
		 * You can do forward Iteration
		 * You can do backward Iteration
		 * It is applicable to the entire List and its classes
		 */

	}
}
