package moduel2.programs;
import java.util.HashSet;
import java.util.Set;
public class SetProperty3 
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
			s1.add(null);
			s1.add(null);
			System.out.println(s1);	
	}
}
