package package2;
//Write a Program with all types of access specifier for constructor and 
//try to access them with in the same class inside package
public class Assignment114 
{
	public Assignment114 ()
	{
		System.out.println("public accessspecifier for constructor");
	}
	protected Assignment114 (int a, int b)
	{
		this();
		int c=a+b;
		System.out.println("protected access for specifier:->"+ c);
	}
	Assignment114 (String name, int age)
	{
		this(15,25);
		String Name = "Rudra";
		int Age = 18;
		System.out.println("Default access specifier for constructor:->" + "Rudra"  + "   age is 18" );
	}
	private Assignment114 (int x, double y)
	{
		this("Rudra",18);
		double z =x+y;
		System.out.println("private access specifier for constructor:->"+z);
	}
	public static void main(String[] args)
	{
		new Assignment114 (15,2.25);
	}

}
