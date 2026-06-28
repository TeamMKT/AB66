package package2;
/*Write a Program with all types of access specifier for instance global variable and try to access them 
outside the package by becoming the sub class */
import package1.Assg104;
/*public class Assg104 
{
	public int a =105;
	protected int b = 75;
	          int c =105;
	private int d = 105;
}*/
public class Assignment104 extends Assg104 
{
	public static void main(String[] args) 
	{
		Assignment104 g = new Assignment104 ();
		System.out.println("Public varaible is : - >" + g.a);
		System.out.println("Protected variable is : ->" + g.b);
		//System.out.println("default variable is : -> "+ g.c);
		//System.out.println("Private variable is :->"+g.d);
		// in different package defacult and protected are restricted.

	}

}
