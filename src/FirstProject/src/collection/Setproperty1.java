package collection;

import java.util.HashSet;
import java.util.Set;

public class Setproperty1 {

	public static void main(String[] args) 
	{
		
		Set s1=new	HashSet();
		s1.add("ram");
		s1.add("ram");// 2 ram will have the same hashcode values
		s1.add("ram");
		s1.add("ram");
		s1.add("ram");
		System.out.println(s1);
	}

}
