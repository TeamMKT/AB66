package Collection_framework_practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class List_Set
{
	public static void main(String[] args) 
	   {
		List <Integer> list = new ArrayList<Integer>();
		list.add(101);
		 list .add(102);
		 list .add(103);
		 list .add(102);
		 list .add(105);
		System.out.println( list );
		Set <Integer> set = new HashSet<Integer>(list);
		System.out.println(set);
		
}
}
