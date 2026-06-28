package package2;
//"Write a Program on Constructor Chaining"
class Assignment96_Ps
{
	Assignment96_Ps()
	{
		
		System.out.println("Constructor 1");
	}
	Assignment96_Ps(int a)
	{
		this();
		System.out.println("Constructor 2");
	}
}
public class Assignment96 extends Assignment96_Ps
{
	Assignment96(int a, int b)
	{
		super(10);
		int c =a+b;
		System.out.println(c);
	}
	Assignment96(double a)
	{
		this(10,25);
		System.out.println(a);
	}
public static void main(String[] args) 
{
	new Assignment96(2.5);
}
}
