package collection;

import java.util.ArrayList;

//Write a Program on add method in the collection class with hetrogeneous Values.
public class Assignment173 {

	public static void main(String[] args)
	{
		ArrayList <Object> list = new ArrayList <Object> ();
		list.add(101);
		list.add(1.25);
		list.add(45.256F);
		list.add(12345789L);
		list.add('G');
		list.add("Rudra");
		list.add(true);
		System.out.println(" Heterogenoeus Values: " + list);
		
		

	}

}
