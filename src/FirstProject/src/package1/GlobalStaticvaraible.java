package package1;
//write a program for static global varaible call inside main method.
public class GlobalStaticvaraible
{
static int a=100;//global variable
	public static void main(String[] args) 
	{
		int a=456;//local variable
		System.out.println(a);
		System.out.println(GlobalStaticvaraible.a);

	}

}
//in execution first print local variable then after execute global variable using object.