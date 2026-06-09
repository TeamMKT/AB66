package moduel2.programs;
//super calling statement
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
		super();//super calling statmenet
		System.out.println("Constructor of child class");
	}
	public static void main(String[] args) 
	{
		new P1();//Calling cons
		
	}
}
