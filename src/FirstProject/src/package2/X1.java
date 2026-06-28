package package2;
interface X3
{
	void e1();
	void e2();
}
interface X2 extends X3
{
	void e3();
	void e4();
}
public class X1 implements X2
{
	public static void main(String[] args) 
	{
		X1 a1=new X1();
		a1 .e1();
		a1.e2();
		a1.e3();
		a1.e4();
	}

	public void e1()
	{
		System.out.println("Real logic 1 ");
		
	}
	public void e2()
	{
		System.out.println("Real logic 2 ");
		
	}
	public void e3()
	{
		System.out.println("Real logic 3 ");
		
	}
	public void e4() 
	{
		System.out.println("Real logic 4 ");
		
	}

}
