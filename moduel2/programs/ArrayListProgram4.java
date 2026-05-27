package moduel2.programs;

import java.util.ArrayList;

public class ArrayListProgram4 
{
	public static void main(String[] args) 
	{
	
		ArrayList<Double> a1=new ArrayList<Double>();
		a1.add(963.96);
		a1.add(1000.7);
		a1.add(96.96);
		a1.add(92.96);
		a1.add(2.96);
		System.out.println(a1);
		
	//	a1.clear();//be empty after this call returns
		System.out.println(a1);
		boolean b1=	a1.isEmpty();
		System.out.println(b1);
		Double d1=	a1.get(4);
		System.out.println(d1);
		a1.iterator();
		a1.listIterator();
		
		System.out.println(a1.size());
		int index=	a1.indexOf(96.96);
		System.out.println(index);
		//a1.lastIndexOf(a1);
		a1.remove(2.96);
		System.out.println(a1);
		a1.remove(1);
		System.out.println(a1);
		a1.remove(a1);

	}
}
