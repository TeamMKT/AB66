package collection;
//write a program on List Interface for ListIterator() of forward Iteration and Backward Iteration and Iterator() also.

import java.util.ArrayList;
import java.util.ListIterator;
public class Assignment183 {

	public static void main(String[] args) 
	{
		ArrayList <Integer> a1 = new ArrayList <Integer> ();
		a1.add(101);
		a1.add(102);
		a1.add(103);
		a1.add(104);
		a1.add(105);
		System.out.println(a1);
		ListIterator <Integer> i1 = a1.listIterator();
		System.out.println("Forward Iteration using ListIterator");
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		System.out.println("Backward Iteration using ListIterator");
		while(i1.hasPrevious())
		{
			System.out.println(i1.previous());
			
		}
		

	}

}
