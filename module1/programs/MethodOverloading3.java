package module1.programs;
public class MethodOverloading3 
{
	
	static void add(int a,double b)
	{
		double c=	a+b;
		System.out.println(c);
	}
	 void add(int a,int b)
	{
		int c=	a+b;
		System.out.println(c);	}
	static void add(double a,int b)
	{
		double c=	a+b;
		System.out.println(c);	}
	 void add(double a,double b)
	{
		double c=	a+b;
		System.out.println(c);	
		}
	public static void main(String[] args) 
	{
		
		add(4.9,6);
		
		add(4,6.6);
		MethodOverloading3 m1=new MethodOverloading3();
		m1.add(6.3, 3.6);
		m1.add(10, 25);

	}
}
