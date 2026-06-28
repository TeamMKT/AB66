package collection;

import java.util.ArrayList;

//write a program on Size method in the Collection class.
public class Assignment181 {

	public static void main(String[] args) 
	{
		ArrayList <Integer> list = new ArrayList <Integer> ();
		list.add(106);
		list.add(111);
		list.add(162);
		list.add(106);
		list.add(152);
		System.out.println("List : " + list);
		Integer i1 = list.size();
		System.out.println("Size is: "+ i1);
		

	}

}
