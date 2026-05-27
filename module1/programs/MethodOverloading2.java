package module1.programs;
public class MethodOverloading2 
{
	static void add(String a,char b)//house 1-Ram 
	{
		System.out.println("Addition 1");
	}
	static void add(String a,char b,boolean c)//house 2-Ram
	{
		System.out.println("Addition 1");
	}
	static void add(boolean a,boolean b,boolean c)
	{
		System.out.println("Addition 1");
	}
	static void add(char b,String a,boolean c)
	{
		System.out.println("Addition 1");
	}
	static void add(int a,double b)
	{
		double c=	a+b;
		System.out.println(c);
	}
	static void add(int a,int b)
	{
		int c=	a+b;
		System.out.println(c);	}
	static void add(double a,int b)
	{
		double c=	a+b;
		System.out.println(c);	}
	static void add(double a,double b)
	{
		double c=	a+b;
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
