package package2;
//what happens within the class about Access specifiers?
public class AccessspecifierforVariables 
{
public static int a=10;
protected static int b=15;
static int c=20;
private static int d=25;
	
	public static void main(String[] args)
	{
		System.out.println(a); //static global variable you can call directly by its name
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	
}

