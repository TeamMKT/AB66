package module1.programs;
public class DatatypeVariable 
{
	static void add()//house 1
	{
		int a=100;//dec and ini
		int b=200;//dec and ini
		int	c=a+b;//utilization
		System.out.println(c);
	}
	static void sub()//house 2
	{
		int a=100;
		int d=200;
		int	f=d-a;//utilization
		System.out.println(f);
		
	}
	static void mul()
	{
		int c=100;
		int d=5;
		int	f=d*c;//utilization
		System.out.println(f);
		
	}
	static void div()
	{
		int c=100;
		int d=200;
		int	f=d/c;//utilization
		System.out.println(f);
		
	}
	static void mod()
	{
		int c=10;
		int d=50;
		int	f=d%c;//utilization
		System.out.println(f);
		
	}
	public static void main(String[] args) 
	{
		add();
		sub();
		mul();
		div();
		mod();
	}
}
