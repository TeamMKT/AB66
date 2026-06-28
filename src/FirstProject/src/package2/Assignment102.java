package package2;
/*Write a Program with all types of access specifier for instance global variable and try to 
access them with in the same class*/
public class Assignment102
{
	public int a = 20;
	protected int b =15;
	int c =25;
	private int d = 45;
	public static void main(String[] args) 
	{
		Assignment102 g1= new Assignment102();
		System.out.println(g1.a);
		System.out.println(g1.b);
		System.out.println(g1.c);
		System.out.println(g1.d);

	}

}
