package methodoverridding;
class A
{
	void diplay()
	{
		System.out.println("A method");
	}
}
public class B extends A
{
    void diplay()
    {
    	super.diplay();
    	System.out.println("B method");
    }
public static void main(String[] args) 
{
	A a1= new B();
	a1.diplay();
}
}