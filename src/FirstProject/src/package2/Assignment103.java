package package2;
/*Write a Program with all types of access specifier for instace global variable and try to access them 
  outside the class however with in the package*/

/*public class Assignment_103 
{
	public int a = 45;
	protected int b= 75;
	int c =65;
	private int d = 85;
}*/
public class Assignment103 
{
    
	public static void main(String[] args) 
	{
		Assignment_103 g = new Assignment_103();
		System.out.println("Public variable : ->" + g.a);
		System.out.println("Protected variable :->" + g.b);
		System.out.println("Default/package :->" + g.c);
		//System.out.println("Private variable is : ->" + g.d);
		// here, private is allowed only inside the class, not allowed in the outside the class
	}

}
