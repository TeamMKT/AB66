package moduel2.programs;
public class StringProblem 
{
	public static void main(String[] args) 
	{
		String a="Automation12";
		String b="Automation Testing";

		System.out.println(a.toLowerCase());
		System.out.println(a.toUpperCase());
	
		boolean b1=	a.equals(b);
		System.out.println(b1);
		boolean b3=	b.contains(a);
		System.out.println(b3);
		
		boolean b4=	a.equalsIgnoreCase("AUTOMATION");
		System.out.println(b4);
		
	}
}
