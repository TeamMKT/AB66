package package2;

public class Assignment115 
{
	public Assignment115 ()
	{
		System.out.println("public accessspecifier for constructor");
	}
	protected Assignment115 (int a, int b)
	{
		int c=a+b;
		System.out.println("protected access for specifier:->"+ c);
	}
	Assignment115 (String name, int age)
	{
		String Name = "Rudra";
		int Age = 18;
		System.out.println("Default access specifier for constructor:->" + "Rudra"  + "   age is 18" );
	}
	private Assignment115 (int x, double y)
	{
		double z =x+y;
		System.out.println("private access specifier for constructor:->"+z);
	}
	

}
