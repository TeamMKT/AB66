package moduel2.programs;
interface F2
{
	void g1();//abstarct method
}
abstract class F3 implements F2
{
	abstract void g2();//abstarct method
	static void g3()
	{
	System.out.println("SLA LOGIC");	
	}

}
public class F1 extends F3
{
	public static void main(String[] args) 
	{
		
	}

	public void g1() 
	{
		System.out.println("Real Logoc 1");
	}

	void g2() 
	{
		System.out.println("Real Logoc 2");
	}
}
