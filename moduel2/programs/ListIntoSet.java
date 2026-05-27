package moduel2.programs;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class ListIntoSet 
{
	public static void main(String[] args) 
	{
		List<String> l1=	new ArrayList<String>();
		l1.add("Arpann");
		l1.add("Arbaaz");
		l1.add("Eugene");
		l1.add("Gaurav");
		l1.add("Arun");
		System.out.println(l1);
		
		Set<String> s1=new HashSet<String>(l1);
		s1.add("Arun");
		System.out.println("Converted List into Set-> "+s1);

	}
}


