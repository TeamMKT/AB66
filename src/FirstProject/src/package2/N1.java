package package2;
//in same class we create one parent class N2 and using externds keyword to call parent and child in main method.
class N2//parent class
{
	static void add()
	{
		System.out.println("Method for parent class");
	}
}

public class N1 extends N2//N1-Child class
{
	static void sub()
	{
		System.out.println("Method for child class");
	}

	public static void main(String[] args) 
	{
		add();
		sub();

	}

}
