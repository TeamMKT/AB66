package package1;
//Write a Program with all types of access specifier for non static methods and try to access them 
//outside the package by becoming the sub class
public class Assg112 
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
	}



