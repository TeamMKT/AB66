package package1;

public class Assg116 
{
	public Assg116 ()
	{
		System.out.println("public accessspecifier for constructor");
	}
	protected Assg116 (int a, int b)
	{
		int c=a+b;
		System.out.println("protected access for specifier:->"+ c);
	}
	Assg116 (String name, int age)
	{
		
		String Name = "Rudra";
		int Age = 18;
		System.out.println("Default access specifier for constructor:->" + "Rudra"  + "   age is 18" );
	}
	private Assg116 (int x, double y)
	{
		
		double z =x+y;
		System.out.println("private access specifier for constructor:->"+z);
	}
}
