package package2;
//Write a Program on This Calling Statement on single level inheritance
class Assignment86_Pc
{
	Assignment86_Pc()
	{
		this(10);
		System.out.println("Method 3");
	}
	Assignment86_Pc(int a)
	{
		System.out.println("Method 4");
	}		
}
public class Assignment86 extends Assignment86_Pc
{
	Assignment86()
	{
		this(10,12.5);
		System.out.println("Method 1");
	}
	Assignment86(int a, double b)
	{
		System.out.println("Method 2");
	}
	
	public static void main(String[] args) 
	{
		new Assignment86();
	}
}
