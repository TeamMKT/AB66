package collection;
//How to convert set into List
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set_into_List 
{
	public static void main(String[] args) 
	{
		Set<Integer> set = new HashSet <Integer> ();
		set.add(589);
		set.add(895);
		set.add(null);
		set.add(689);
		set.add(89);
		set.add(589);
		set.add(null);
		
		System.out.println(set);
		List <Integer> list = new ArrayList<Integer>(set);
		list.add(255);
		System.out.println("Converted Set into List: " + list);
		
	}

}
