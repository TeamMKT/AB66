package package2;
//Write a Program with all types of access specifier for constructor and try to access them 
//outside the package by becoming the sub class
import package1.Assg116;
public class Assignment116 extends Assg116
{
	Assignment116()
	{
		super(15,25);
	}
	Assignment116(int a, int b)
	{
		super();
	}
	public static void main(String[] args) 
	{
		new Assignment116();
		new Assignment116(15,25);
	}

}
/*package package1;

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
}*/
