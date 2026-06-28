package package2;
//Write a program for constructor inheritance using the super calling statement with Implicit Invocation
class Ass82
{
	Ass82()
	{
		
		System.out.println("Method 1");
	}
}

public class Assignment82 extends Ass82
{
	Assignment82()
	{
		super();  //implicit invocation means don't write super
		System.out.println("Method 2");
	}
	
	
	public static void main(String[] args) 
	{
		Assignment82 a1=new Assignment82();
	}

}
