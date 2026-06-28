package Stringfunctions;
public class StringProblems 
{
	public static void main(String[] args) 
	{
		String a = "Automation";
		String b = "Automation Testing";
		boolean b1 = b.equals(b);
		System.out.println(b1);
		boolean b2 = a.equals(b);
		System.out.println(b2);
		boolean b3= a.contains(a);
		System.out.println(b3);
		boolean b4= a.contains(b);
		System.out.println(b4);
		boolean b5= b.contains(a);
		System.out.println(b5);
		boolean b6 = b.equalsIgnoreCase("Automation Testing");
		System.out.println(b6);
		boolean b7 = a.equalsIgnoreCase("AutomatION");
		System.out.println(b7);
		boolean b8 = b.equalsIgnoreCase("Automation ");
		System.out.println(b8);
		
		
		
		
		

	}

}
