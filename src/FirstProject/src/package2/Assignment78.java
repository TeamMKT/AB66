package package2;
//Write a Program for Multi Level Inheritance.
class GP 
{
	static void sub()
	{
		System.out.println("The method of grand parent");
	}
}

class P extends GP
{
	static void mul()
	{
		System.out.println("The method of  parent");
	}
}

public class Assignment78 extends P
{
	void add()
	{
	System.out.println("The method of Child");
	}
	
	public static void main(String[] args)
	{
		sub();
		mul();
		Assignment78 c1=new Assignment78();
		c1.add();
	}

}
