package collection;

import java.util.ArrayList;

public class ArrayListPractice2
{
    public static void main(String[] args) 
    {
		ArrayList<Integer> a1 = new ArrayList <Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(2, 25);
		System.out.println(a1);
		ArrayList<Integer> a2 = new ArrayList <Integer>();
        a2.add(10);
        a2.add(15);
        a2.add(20);
        a2.clear();
        System.out.println(a2);
		
		
		
		
	}
}
