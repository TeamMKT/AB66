package collection;

import java.util.ArrayList;
import java.util.List;

public class Count_totalElemnts {

	public static void main(String[] args) {
		List <Integer> list = new ArrayList <Integer> ();
		list.add(101);
		list.add(205);
		list.add(350);
		list.add(195);
		list.add(205);
		list.add(2);
		System.out.println("List : " + list);
		int count = list.size();
		System.out.println(count);
		boolean b1 = list.contains(456);
		System.out.println(b1);
		

	}

}
