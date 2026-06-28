package collection;

import java.util.ArrayList;

public class ArrayList_Program {

	public static void main(String[] args) 
	{
		ArrayList<Double>a1 = new ArrayList<Double>();
		a1.add(963.96);
		a1.add(456.25);
		a1.add(56.96);
		a1.add(89.76);
		a1.add(2.96);
		System.out.println(a1);
		double d1=a1.get(3);
		System.out.println(d1);
		a1.clear();
		System.out.println(a1);
		boolean b1 = a1.isEmpty();
		System.out.println(b1);
		
		
		

	}

}
