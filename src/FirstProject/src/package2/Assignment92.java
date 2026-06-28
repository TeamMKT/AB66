package package2;
//"Write a program on  Paramterized this calling stament"
public class Assignment92 
{
	Assignment92(double a)
	{
		this(15,25);
	    System.out.println("Print double value:"+a);
	}
	Assignment92(int a)
	{
	     this("Rudra",18);
		System.out.println("Print integer value a:"+a);	
	}
	Assignment92(int a, int b)
	{
		this(25);
		int c =a*b;
		System.out.println("Multiply:"+c);
	}
	Assignment92(String name, int age)
	{
		
		String Name = name;
		int Age = age;
		System.out.println("Name:"+ Name);
		System.out.println("Age:"+ Age);
	}
	public static void main(String[] args) 
	{
		new Assignment92(2.5);
	}
}
