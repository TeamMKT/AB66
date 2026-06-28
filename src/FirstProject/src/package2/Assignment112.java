package package2;
//Write a Program with all types of access specifier for non static methods and try to access them 
//outside the package by becoming the sub class
import package1.Assg112;
public class Assignment112 extends Assg112
{
	public static void main(String[] args) 
	{
		Assignment112 g=new Assignment112();
		g.add(15, 23);
		g.add(25, 16, 45);
	}
}
/*package package1;
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
	}*/




