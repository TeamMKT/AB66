package package2;
//"Write a program on Non Paramterized this calling stament"
public class Assignment91 
{
	Assignment91()
	{
		this(15,25);
	    System.out.println("This is This calling method");
	}
	Assignment91(int a)
	{
	     this("Rudra",18);
		System.out.println("Print integer value a:"+a);	
	}
	Assignment91(int a, int b)
	{
		this(25);
		int c =a*b;
		System.out.println("Multiply:"+c);
	}
	Assignment91(String name, int age)
	{
		
		String Name = name;
		int Age = age;
		System.out.println("Name:"+ Name);
		System.out.println("Age:"+ Age);
	}
	public static void main(String[] args) 
	{
		new Assignment91();
	}
}
