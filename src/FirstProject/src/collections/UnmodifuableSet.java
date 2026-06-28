package collections;

import java.util.Collections;
import java.util.HashSet;

import java.util.Set;

public class UnmodifuableSet {

	public static void main(String[] args) {
		Set<Integer> set =  new HashSet<Integer>();
		set.add(101);
		set.add(102);
		set.add(103);
		Set <Integer> set2 = Collections.unmodifiableSet(set);
		System.out.println("UnmodifiableSet:" + set);
		set2.add(104);
		System.out.println("UnmodifiableSet:" + set2);

		

		

	}

}
