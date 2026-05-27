package moduel2.programs;
//super calling statement
class P5
{
	P5(String a,char b)
	{
		System.out.println("Constructor of grand parent class");
	}
}
class P4 extends P5
{
	P4(int a,int b)
	{   
		super("MKT",'X');
		//super();//1. Super calling statenet is useful to call the parent class constructor from the child class constructor
		System.out.println("Constructor of parent class");
	}
}
public class P3 extends P4
{
	P3()
	{   	
		super(10,20);
	//	super();//1. Super calling statenet is useful to call the parent class constructor from the child class constructor
		System.out.println("Constructor of child class");
	}
	public static void main(String[] args) 
	{
		new P3();//Calling cons
		
	}
}
