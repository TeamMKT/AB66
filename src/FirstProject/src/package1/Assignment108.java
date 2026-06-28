package package1;
/*Write a Program with all types of access specifier for static methods and try to access 
them outside the package without becoming the sub class */
import package2.Assg108;
public class Assignment108 extends Assg108
{
	public static void main(String[] args) 
	{
		Assignment108 .add(15, 25);
		Assignment108.add(25, 35, 65);
	}
}
/*package package2;

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
}*/


