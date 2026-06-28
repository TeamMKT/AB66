package collection;
//how to convert List into Set?			
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class List_into_Set
{
	public static void main(String[] args) 
	{
		List <String> list = new ArrayList <String> ();
		  list.add("Rudra");
		  list.add("Ravi");
		  list.add("Roma");
		  list.add("Raja");
		  list.add("Rudra");
		  System.out.println(list);
		  
		  Set <String> set=new HashSet<String>(list);
		  set.add("Rudra");
		  System.out.println("Converted List into Set : " + set);
	  
		
	}
}
