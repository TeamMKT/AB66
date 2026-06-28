package methodoverridding;

class Parent
{
	void show()
	{
		System.out.println("Parent method");
	}
}
public class Child extends Parent
{
    void show()
    {
		System.out.println("Child method");

    }
public static void main(String[] args) 
{
	Parent p = new Child();//run time ploymorphism
	p.show();
	
}
}