package moduel2.programs;
class N2                        //Parent Class-Super CLass
{
	static void add()
	{
		System.out.println("Method of Parent Class");
	}
}
public class N1 extends N2 //extends is a keyword //Sub class->child class
{
	
	static void sub()
	{
		System.out.println("Method of child Class");
	}
	public static void main(String[] args) 
	{
		add();
		sub();
		
	}
}
