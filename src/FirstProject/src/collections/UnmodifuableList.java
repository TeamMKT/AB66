package collections;

import java.util.ArrayList;

import java.util.Collections;

import java.util.List;


public class UnmodifuableList {

	public static void main(String[] args) {
		List<Integer> list1 =  new ArrayList<Integer>();
		list1.add(101);
		list1.add(102);
		list1.add(103);
		List <Integer> list2 = Collections.unmodifiableList(list1);
		System.out.println("UnmodifiableSet:" + list1);
		list2.add(104);
		System.out.println("UnmodifiableSet:" + list2);

		

		

	}

}
