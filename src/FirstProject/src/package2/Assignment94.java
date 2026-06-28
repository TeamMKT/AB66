package package2;
//Write a program for constructor inheritance using the super calling statement with Explicit Invocation
class Assignment94_GPC
{
	Assignment94_GPC(int a)
	{
		
		System.out.println("Print a:"+a);
	}
}
class Assignment94_PC extends Assignment94_GPC
{
	Assignment94_PC(int a, int b)
	{
		super(10);
		int c =a*b;
		System.out.println("Multiply:"+c);
	}
}
public class Assignment94 extends Assignment94_PC
{
	Assignment94(String name)
	{
		super(10,20);
		String Name=name;
		System.out.println("Name:"+Name);
	}
	public static void main(String[] args) 
	{
		new Assignment94("Rudra");
	}
}
