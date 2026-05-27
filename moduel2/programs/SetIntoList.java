package moduel2.programs;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class SetIntoList 
{
	public static void main(String[] args) 
	{
			Set<String> s1=		new HashSet<String>();
			s1.add("ram");
			s1.add("divya");
			s1.add("geeta");
			s1.add("ishrat");
			s1.add("monika");
			s1.add("nishant");
			System.out.println(s1);
			
		List<String> laxmi=new ArrayList<String>(s1);
		System.out.println("Converted Set into List->"+laxmi);
	}
}
