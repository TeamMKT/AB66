package package2;
//Write a Program with all types of access specifier for global variable and try to access them with in the same class
public class Assignement97 
{
 public static int a=25;
 protected int b=35;
 static int c=45;
 private int d=55;
	
	public static void main(String[] args) 
	{
	System.out.println(a);
	System.out.println(c);
	Assignement97 g1=new Assignement97();
	System.out.println(g1.b);
	System.out.println(g1.d);
	

	}

}
