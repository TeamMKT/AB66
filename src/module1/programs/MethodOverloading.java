package module1.programs;
public class MethodOverloading 
{
	static void add()
	{
		System.out.println("Addition 1");
	}
	static void add(int a,double b)//a and b are local variable
	{
		double c=	a+b;//c is local variable
		System.out.println(c);
	}
	static void add(int a,int b)//a and b are local variable
	{
		int c=	a+b;//c is local variable
		System.out.println(c);	}
	static void add(double a,int b)//a and b are local variable
	{
		double c=	a+b;//c is local variable
		System.out.println(c);	}
	static void add(double a,double b)//a and b are local variable
	{
		double c=	a+b;//c is local variable
		System.out.println(c);	
		}
	public static void main(String[] args) 
	{
		add(1.1,2.9);
		add(4.9,6);
		add(4,6);
		add(4,6.6);

	}
}
