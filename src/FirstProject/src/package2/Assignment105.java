package package2;
/*Write a Program with all types of access specifier for instance global variable and try to access them 
outside the package without becoming the sub class*/
import package1.Assg105;

/*package package1;

public class Assg105 
{
	public int a =105;
	protected int b = 75;
	          int c =105;
	private int d = 105;
}*/

public class Assignment105 
{
	public static void main(String[] args) 
	{
		Assg105  g = new Assg105 ();
		System.out.println("public variable is :->"+g.a);
		//System.out.println("protected varaible is : ->"+g.b);
		//System.out.println("default variable is : -> "+ g.c);
		//System.out.println("Private variable is :->"+g.d);
		// in different package defacult and protected and private are restricted.
		//here protected becuse there is no relatin in the classes
	}
	
	
	
}
