package package2;
/*Write a Program with all types of access specifier for static methods and 
  try to access them with in the same class inside package*/
public class Assignment106 
{
	public static void add(int a, int b)
	{
		int c  = a+b;
		System.out.println("public access specifier for static method: ->"+c);
	}
	protected static void add(int a, int b, int c)
	{
		int d =a+b+c;
		System.out.println("protected access specifier for static method: ->"+d);
	}
    static void mul(int x, int y)
    {
    	int z = x*y;
    	System.out.println("default/package access specifier for static method: ->"+z);
    }
    private static void sub(double p , double q)
    {
    	double r = p-q;
    	System.out.println("private access specifier for static method: ->"+r);
    }
	public static void main(String[] args)
	{
		add(10,20);
		add(10,20,30);
		mul(15,12);
		sub(1.25,0.25);
	}
}
