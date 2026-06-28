package package2;
//Write a Program with all types of access specifier for non static methods and try to access them 
//outside the package without becoming the sub class
import package1.Assg113;
public class Assignment113
{
	public static void main(String[] args) 
	{
	Assg113 g =new Assg113 ();
	g.add(25, 45);
	}
}
/*package package1;

public class Assg113 
{
	public void add(int a, int b)
	{
		int c  = a+b;
		System.out.println("public access specifier for non static method: ->"+c);
	}
	protected  void add(int a, int b, int c)
	{
		int d =a+b+c;
		System.out.println("protected access specifier for non static method: ->"+d);
	}
    void mul(int x, int y)
    {
    	int z = x*y;
    	System.out.println("default/package access specifier for non static method: ->"+z);
    }
    private void sub(double p , double q)
    {
    	double r = p-q;
    	System.out.println("private access specifier for non static method: ->"+r);
    }
}*/