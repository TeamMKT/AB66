package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Find the samllest element in a List?
public class MinElemnt_List {

	public static void main(String[] args)
	{
		List <Integer> list = new ArrayList <Integer> ();
		list.add(101);
		list.add(205);
		list.add(350);
		list.add(195);
		list.add(205);
		list.add(2);
		System.out.println("List : " + list);
		
		Collections.max(list);
		System.out.println("Max: " + Collections.max(list));
		Collections.min(list);
		System.out.println("Min : "+Collections.min(list));
		Collections.sort(list);
		System.out.println("Sorted: " + list);
		Collections.reverse(list);
		System.out.println("ReverseSort : " + list);
		int freq=Collections.frequency(list, 205);
		System.out.println("Frequency : " + freq);

	}

}
