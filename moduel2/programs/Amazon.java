package moduel2.programs;

public class Amazon extends Object
{
	Amazon()
	{
		this(100);
		System.out.println("COnstructor 1");
	}
	Amazon(int a)
	{
		this(10,10.6);
		System.out.println("COnstructor 2");
	}
	Amazon(int a,double b)
	{
		System.out.println("COnstructor 3");
	}
	public static void main(String[] args) 
	{
		Amazon m1=	new Amazon();
		m1.getClass();
	}
}
