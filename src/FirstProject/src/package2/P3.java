package package2;
//Super calling statement for parametrized constructors  explicitly.
class P4
{
	P4(int a)
	{
		System.out.println("Constructor of parent class");
	}
}
public class P3 extends P4
{
    P3()
    {
    	super(100); //here we can write it super it is parametrized cosntructor explicitly.
    	System.out.println("Constructor of child class");

	}
public static void main(String[] args)
{
	new P3();//calling constructor
	
}
}
