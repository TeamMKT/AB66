package moduel2.programs;
abstract class O2
{
	abstract void add();
	abstract void sub();
	static void mul()
	{
		System.out.println("SLA Agrrement -Exposing this Logic");
	}
}
public class O1 extends O2
{
	void add()
	{
		System.out.println("Real Logic 1");
	}
	void sub()
	{
		System.out.println("Real Logic 2");
	}
	public static void main(String[] args) 
	{
		
	}
}
