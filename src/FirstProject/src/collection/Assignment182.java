package collection;

import java.util.ArrayList;
import java.util.List;

//write a program on List Methods from add() to size() in the List Class
public class Assignment182 {

	public static void main(String[] args)
	{
		List <String> list = new ArrayList <String> ();
		list.add("kavita");
		list.add("Roma");
		list.add("Geeta");
		list.add("Rudra");
		list.add("ravi");
		System.out.println("List :" + list);
		int i1 =list.size();
		System.out.println("Size : " + i1);

	}

}
