package package2;
//Write a Program with all types of access specifier for non static methods and try to access them outside the class
public class Assignment111
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
/*package package2;

public class Assg111 
{

	public static void main(String[] args) 
	{
		Assignment111 g = new Assignment111();
		g.add(15, 45);
    	g.add(25, 65, 85);
    	g.mul(25, 65);
}*/

