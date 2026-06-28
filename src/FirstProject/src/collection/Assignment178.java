package collection;

import java.util.ArrayList;

// write a program on Contains All method in the Collection class.
public class Assignment178
{
	public static void main(String[] args) 
	{
		ArrayList <String> list1 = new ArrayList <String> ();
		 list1.add("Ravi");
		 list1.add("Rudra");
		 list1.add("Ramu");
		 list1.add("Raja");
		 list1.add("Rudra");
		 list1.add(null);
		 System.out.println("List1 : " + list1);
		 ArrayList <String> list2 = new ArrayList <String>();
		 list2.add("Kavita");
		 list2.add("Roma");
		 list2.add("Khushi");
		 list2.add("Roma");
		 list2.add(null);
		 System.out.println("List2 : "+ list2);
		 boolean b1=list1.contains(list2);
		 System.out.println("Does List1 contain all elements of List2? " + b1);

	}

}
