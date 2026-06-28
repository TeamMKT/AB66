package package2;

public class Assg108 
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
}

