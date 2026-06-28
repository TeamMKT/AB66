package polymorphism;

public class Calculator 
{
	Calculator (int a, int b)
	{
		int c =a+b;
		System.out.println("Adding the integers a and b is:" + c);
	}
	Calculator (double a, double b)
	{
		double c =a+b;
		System.out.println("Adding the double a and b is:" + c);
	}
	Calculator (int a, int b, int c)
	{
		int d =a+b+c;
		System.out.println("Adding the integers a ,b and c is:" + d);
	}
	public static void main(String[] args) 
	{
		new Calculator(15,12);
		new Calculator(1.25,1.26);
		new Calculator(15,12,13);
	}
	
}
