package package2;
//Super calling statement for non parametrized constructors implicitly as well as explicitly.
class P2
{
	P2()
	{
		System.out.println("Constructor of parent class");
	}
}
public class P1 extends P2
{
    P1()
    {
    	//super(); here we can write it super or not no issue, it is non parametrized cosntructor.
    	System.out.println("Constructor of child class");

	}
public static void main(String[] args)
{
	new P1();
}
}
