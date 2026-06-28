package collection;

import java.util.ArrayList;

public class ArrayList_Program2 {

	public static void main(String[] args) 
	{
		ArrayList<Double>a1 = new ArrayList<Double>();
		a1.add(963.96);
		a1.add(456.25);
		a1.add(56.96);
		a1.add(89.76);
		a1.add(2.96);
		System.out.println(a1);
		int i1 = a1.size();
		System.out.println(i1);
		//int i2 = a1.lastIndexOf(3);
		//System.out.println(i2);
		double d1 = a1.remove(2);
		System.out.println(d1);
		boolean b1 =a1.remove(456.25);
		System.out.println(b1);
		boolean b2 = a1.remove(a1);
		System.out.println(b2);
	}
}
