package collection;

import java.util.ArrayList;

public class ArrayList_program5 
{
	public static void main(String[] args) 
	{
		ArrayList <Integer> a1 = new ArrayList <Integer>();
		a1.add(456);
		a1.add(567);
		a1.add(89);
		a1.add(95);
		a1.add(56);
		System.out.println(a1);
		ArrayList <Integer> a2 = new ArrayList <Integer>();
        a2.add(568);
        a2.add(7562);
        a2.add(4589);
        a2.add(263);
        a2.add(22);
        System.out.println(a2);
        a1.addAll(a2);
        System.out.println(a1);
        a1.removeAll(a2);
        System.out.println(a1);
        a2.removeAll(a1);
        System.out.println(a2);
	}

}
