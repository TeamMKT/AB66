package package1;
//"Write a Program to call parameterized Constructor Overloading"
public class Assignment28 {
	Assignment28(int a, int b)
	{
		int c=a+b;
	System.out.println(c);
	}
	Assignment28(int a, double b)
	{
		double c=a+b;
		System.out .println(c);
	}
	Assignment28(int a , double b, float c)
	{
		double d=a+b+c;
	System.out.println(d);
	}
	public static void main(String[] args) {
		new Assignment28(12,15);
		new Assignment28(15,2.75);
		new Assignment28(12,2.25,3.45f);
		
	}

}

	
