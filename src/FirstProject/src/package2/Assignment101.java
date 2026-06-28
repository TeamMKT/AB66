package package2;
//Write a program with combination of super and this calling statement 
class Assg
{
	Assg()
	{
		String name = "Rudra";
		System.out.println("My son name is :->" + name);
	}
	Assg(int a)
	{
		this();
		System.out.println("the integer value : - >"+a);
	}
	Assg(int a, int b)
	{
		this(10);
		int c =a+b;
		System.out.println("The sum of the integer value is :->"+c);
	}
}
public class Assignment101 extends Assg
{
	Assignment101()
	{
		super(10,20);
		System.out.println("Rudra age is 18");
	}
	Assignment101(String name)
	{
		this();
		String Name = name;
		System.out.println("My name is :->" + "Rudra");
	}
	Assignment101(String name, int age)
	{
		this("Rudra");
		String name1= name;
		int age1 = age;
		System.out.println("My son name is :->"+name1 + "  &  Age is :->"+age);
	}
public static void main(String[] args)
	{
		new Assignment101("Rudra",18);
	}

}
