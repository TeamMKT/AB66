package collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class Setproperty4 
{
	public static void main(String[] args) 
	{
		Set<String> s1=new HashSet<String>();
		s1.add("ram");
		s1.add("divya");
		s1.add("geeta");
		s1.add("ishrat");
		s1.add("monica");
		s1.add("nishant");
		System.out.println(s1);
		System.out.println("Iteration uisng Iterator:");
		Iterator <String> ids = s1. iterator();
		while(ids.hasNext())
		{
			System.out.println(ids.next());
		}
	}

}