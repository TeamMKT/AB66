package Collection_framework_practice;

import java.util.ArrayList;

public class Test 
{
   public static void main(String[] args)
   {
	  ArrayList <Integer> a1 = new ArrayList<Integer>();
	  a1.add(101);
	  a1.add(102);
	  a1.add(103);
	  a1.add(104);
	  a1.add(null);
	  a1.add(105);
	 System.out.println(a1);
	 System.out.println(a1.size());
	 int i3 = a1.set(2, 106);
		System.out.println(a1);
	 a1.add(1, 106);
	  System.out.println(a1);
	  boolean b1 = a1.addAll(a1);
	  System.out.println(b1);
	  int i1 = a1.get(4);
	  System.out.println(i1);
	  a1.contains(105);
	  System.out.println( a1.contains(105));
	  int i2 = a1.size();
	System.out.println(i2);
	
}
}
