package module1.programs;
public class ParametrizedMethod 
{
	
	static void add(int a,int b,double c)//local variable
	{
		double sum=a+b+c;
		System.out.println(sum);
	}
	static void multiply(double a,int b)//)//local variable
	{
		double c=a*b;
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		System.out.println("This is My Main Method");
		add(100,900,400);
		multiply(6.3,100);
		
	}
}
