package package2;
/*Write a program for constructor - single level inheritance using a non-parameterized 
super calling statement with explicit invocation*/
class Ass83
{
	Ass83()
	{
		int a=15;
		int b=25;
		int c=a+b;
		System.out.println(c);
	}
}


public class Assignment83 extends Ass83
{
	Assignment83()
	{
		super();
		int a=56;
		int b=25;
		int c=a-b;
		System.out.println(c);
	}
	
	public static void main(String[] args) 
	{
		new Assignment83();
		
	}

}
