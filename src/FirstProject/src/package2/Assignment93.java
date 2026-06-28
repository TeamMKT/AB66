package package2;
//Write a program for constructor inheritance using the super calling statement with Implicit Invocation.
class Assignment93_GPC
{
	Assignment93_GPC()
	{
		System.out.println("This is constrctor inheritance 1");
	}
}
class Assignment93_PC extends Assignment93_GPC
{
	Assignment93_PC()
	{
		System.out.println("This is constrctor inheritance 2");
	}
}
public class Assignment93 extends Assignment93_PC
{
	Assignment93()
	{
		System.out.println("This is constrctor inheritance 3");
	}
	public static void main(String[] args) 
	{
		new Assignment93();
	}
}
