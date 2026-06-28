package Collection_framework_practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Practice_9 
{
  public static void main(String[] args) 
  {
	ArrayList <Integer>a1 = new ArrayList<Integer>();
	a1.add(101);
	a1.add(102);
	a1.add(102);
	a1.add(105);
	a1.add(105);
	System.out.println(a1);
	Set<Integer> s1 = new HashSet <Integer > (a1);
	Set<Integer> s2 = new HashSet <Integer > ();
	System.out.println("Duplicates:" + s1);
	for (Integer i1 : a1)
	{
		if(!s1.add(i1))
		{
			s2.add(i1);
		}
	}
	System.out.println(s2);
	


	
	
}
}
