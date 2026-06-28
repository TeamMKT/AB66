package package2;
//single level inheritance, concrete class extends Abstract class
abstract class BParent   //100% abstraction
{
	abstract void b1();
	abstract void b2();
}

public class ConcreteClassChild extends BParent
{
	void login()
	{
		System.out.println("logic");
	}

	public static void main(String[] args) 
	{
		ConcreteClassChild a1=new ConcreteClassChild();
		a1.b1();
		a1.b2();

	}
  
	void b1() 
	{
		System.out.println("Real logic 1");
	}

	
	void b2()
	{
		System.out.println("Real logic 2");
	}

}
