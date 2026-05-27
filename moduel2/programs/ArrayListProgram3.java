package moduel2.programs;

import java.util.ArrayList;

public class ArrayListProgram3 
{
	public static void main(String[] args) 
	{
	
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(963);
		a1.add(1000);
		a1.add(96);
		a1.add(92);
		a1.add(2);
		System.out.println(a1);
		ArrayList<Integer> a2=new ArrayList<Integer>();
		a2.add(9632);
		a2.add(10020);
		a2.add(962);
		a2.add(922);
		a2.add(22);
		System.out.println(a2);
		
		a1.addAll(a2);
		System.out.println(a1);
		
		a1.removeAll(a2);
		System.out.println(a1);
		
	}
}
