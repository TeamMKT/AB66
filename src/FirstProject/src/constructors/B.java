package constructors;
class A
{
	A()
	{
		System.out.println("A");
	}
	
}

public class B extends A
{
    B()
    {
    	System.out.println("B");
    }
public static void main(String[] args) 
{
	new B();
	
}
}
