package moduel2.programs;
public class StringBuilderProgram 
{
	public static void main(String[] args) 
	{
		StringBuilder s1=new StringBuilder("Automation");
		System.out.println(s1.append(" Testing"));
		s1.insert(11, "API ");		
		System.out.println(s1);
		
		s1.delete(11, 15);
		System.out.println(s1);
	

	}
}
