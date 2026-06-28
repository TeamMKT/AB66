package array_String;

public class Practise5 
{
	public static void main(String[] args) 
	{
		String a = "Automation";
		String b = "Automation Testing";
		boolean b1 = a.equals(b);
		System.out.println(b1);
		boolean b2 = a.contains(b);
		System.out.println(b2);
		boolean b3 = b.contains(a);
		System.out.println(b3);
		boolean b4 = a.equalsIgnoreCase(b);
		System.out.println(b4);
		boolean b5= a.equalsIgnoreCase("AUTOMATION  TESTING");
		System.out.println(b5);
	}

}
