package collection;

import java.util.ArrayList;

public class ArrayList_program6 {

	public static void main(String[] args)
	{
		ArrayList <Integer> a1 = new ArrayList <Integer>();
		a1.add(963);
		a1.add(562);
		a1.add(789);
		a1.add(58);
		a1.add(22);
		System.out.println(a1);
		a1.remove(a1.size()-1);
		System.out.println(a1);
	}

}
