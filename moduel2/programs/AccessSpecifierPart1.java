package moduel2.programs;
public class AccessSpecifierPart1 
{
	public static int a=10;
	protected static int b=11;
	 static int c=12;
	private static int d=13;
	
	public static void add()
	{
		System.out.println("Method 1");
	}
	protected	static void sub()
	{
		System.out.println("Method 2");
	}
	static void mul()
	{
		System.out.println("Method 3");
	}
	private static void div()
	{
		System.out.println("Method 4");
	}
	public static void main(String[] args) 
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		add();
		sub();
		mul();
		div();

		
	}
}
