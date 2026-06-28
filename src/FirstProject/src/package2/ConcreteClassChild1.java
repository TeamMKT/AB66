package package2;
abstract class BParent2   //100% abstraction
{
	abstract void b3();
	abstract void b4();
}
abstract class BParent1 extends BParent2
{
	abstract void b1();
	abstract void b2();
}

public class ConcreteClassChild1 extends BParent1
{
	void login()
	{
		System.out.println("logic");
	}

	public static void main(String[] args) 
	{
		ConcreteClassChild1 a1=new ConcreteClassChild1();
		a1.b1();
		a1.b2();
		a1.b3();
		a1.b4();
	}
   
	void b1() 
	{
		System.out.println("Real logic 1");
	}

	
	void b2()
	{
		System.out.println("Real logic 2");
	}

	void b3() 
	{
		System.out.println("Real logic 3");	
	}
  
	void b4() 
	{
		System.out.println("Real logic 4");	
	}

}
