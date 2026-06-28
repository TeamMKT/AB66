package package2;
//Write a program for constructor inheritance- Multi level using a parameterized super calling statement with explicit invocation
class Assignment95_GPs
{
	Assignment95_GPs(int a)
	{
		System.out.println("Interger a:"+a);
	}
}
class Assignment95_pc extends Assignment95_GPs
{
	Assignment95_pc(int a, int b)
	{
		super(75);
		int c =a+b;
		System.out.println("addition:"+c);
	}
}
public class Assignment95 extends Assignment95_pc
{
	Assignment95(double a, double b)
	{
		super(10,25);
		double c= a+b;
		System.out.println("Addition:"+c);
	}
public static void main(String[] args) 
{
	new Assignment95(1.25,2.25);
}
}
