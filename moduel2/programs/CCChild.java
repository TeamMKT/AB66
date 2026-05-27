package moduel2.programs;
abstract class BParent       //100% abstarction
{
	abstract void b1();
	abstract void b2();

}
public class CCChild extends BParent
{
	static void method1()
	{
		System.out.println("Logic");
	}
	
	public static void main(String[] args) 
	{
		
	}

	void b1() 
	{
		System.out.println("Real Logic 1");
	}

	void b2() 
	{
		System.out.println("Real Logic 2");

	}
}
