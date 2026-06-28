package package2;
//Write a Program with all types of access specifier for non static methods and try to access them with in the same class
public class Assignment110
{
	public void add(int a, int b)
	{
		int c  = a+b;
		System.out.println("public access specifier for static method: ->"+c);
	}
	protected  void add(int a, int b, int c)
	{
		int d =a+b+c;
		System.out.println("protected access specifier for static method: ->"+d);
	}
    void mul(int x, int y)
    {
    	int z = x*y;
    	System.out.println("default/package access specifier for static method: ->"+z);
    }
    private void sub(double p , double q)
    {
    	double r = p-q;
    	System.out.println("private access specifier for static method: ->"+r);
    }
    public static void main(String[] args)
    {
    	Assignment110 g =new Assignment110();
    	g.add(15, 45);
    	g.add(25, 65, 85);
    	g.mul(25, 65);
    	g.sub(2.25, 1.75);
	}
}
