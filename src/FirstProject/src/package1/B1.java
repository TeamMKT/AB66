package package1;
class B2
{
	B2(int a)
	{
		
		System.out.println("Constructor 1");
	}
	B2()
	{
		this(100);
		System.out.println("Constructor 2");
	}
}
public class B1 extends B2
{
	B1(int a,double b)
	{
		super();
		System.out.println("Constructor 3");
	}
	B1()
	{
		this(10,12.5);
		System.out.println("Constructor 4");
	}
	public static void main(String[] args) 
	{
		new B1();
		
	
	}
}
