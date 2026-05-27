package moduel2.programs;
abstract class BParent2       //100% abstarction
{
	abstract void b3();
	abstract void b4();

}
abstract class BParent1  extends  BParent2    //100% abstarction
{
	abstract void b1();
	abstract void b2();

}
public class CCChild2 extends BParent1
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

	void b3() 
	{
		System.out.println("Real Logic 3");

	}

	void b4() 
	{

		System.out.println("Real Logic 4");

	}
}
