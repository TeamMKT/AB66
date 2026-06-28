package collection;

import java.util.HashSet;
import java.util.Set;

public class Setproperty {

	public static void main(String[] args) 
	{
		
		Set<String> s1=new HashSet<String>();
		s1.add("ram");
		s1.add("divya");
		s1.add("geeta");
		s1.add("ishrat");
		s1.add("monica");
		s1.add("nishant");
		s1.add("null");
		s1.add("null");
		System.out.println(s1);
	}

}
//it does not follow indexing and its not follow order of inserrtion. But it follows Hashcode values.
//here, 2 null values are there, set doesnot follow duplicate values.