package package2;
import package1.Assg109;
/*Write a Program with all types of access specifier for static methods and try to access them outside the 
 package without becoming the sub class*/
public class Assignment109 
{
	public static void main(String[] args) 
	{
		Assg109.add(15, 25);
	}
}
/*package package1;

public class Assg109 
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
}*/

