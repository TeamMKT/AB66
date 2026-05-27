package moduel2.programs;
class L2
{
	static void method2()
	{
		System.out.println("Method 2");
	}
	void method3()
	{
		System.out.println("Method 3");
	}
}
public class L1 extends L2
{
	 int noOfdays=60;

	static void method1()
	{
		System.out.println("Method 1");
	}
	void method4()
	{
		System.out.println("Method 4");
	}
	public static void main(String[] args) 
	{
		method1();
		method2();
		L1 l1=new L1();
		l1.method3();//Parent class-NS
		l1.method4();//Child class-NS
		System.out.println(l1.noOfdays);
		
	}
}
