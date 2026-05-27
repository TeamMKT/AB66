package moduel2.programs;

public class Flipkart 
{
	Flipkart()
	{
		this(500);
		System.out.println("COnstructor 1");
	}
	Flipkart(int a)
	{
		System.out.println("COnstructor 2");
	}
	Flipkart(int a,double b)
	{
		this();
		System.out.println("COnstructor 3");
	}
	public static void main(String[] args) 
	{
		new Flipkart(10,6.3);
	}
}
