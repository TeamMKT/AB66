package Collection_framework_practice;

import java.util.ArrayList;

public class ArrayList1
{
  public static void main(String[] args) 
  {
	 ArrayList <Integer> a1 = new ArrayList<Integer>();
	 a1.add(101);
	 a1.add(102);
	 a1.add(103);
	 a1.add(104);
	 System.out.println("Arraylist :"+ a1);
	boolean b1 =a1.contains(105);
	System.out.println(b1);
	a1.ensureCapacity(500);
	System.out.println(a1);
	int i1 = a1.get(0);
	System.out.println(i1);
	int i2 =a1.get(3);
	System.out.println(i2);
	int i3 = a1.remove(1);
	System.out.println(i3);
	System.out.println(a1);
	boolean b = a1.remove(Integer.valueOf(103));
	System.out.println(b);
	System.out.println(a1);
	int i4 = a1.size();
	System.out.println(i4);
	boolean b2 = a1.isEmpty();
	 System.out.println(b2);
	 a1.clear();
	System.out.println(a1);
	 
	 
}
}
