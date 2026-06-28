package package2;
//Write a program to create a constructor that initializes two numbers and prints their sum.
public class ConstructorwithVariables {
	ConstructorwithVariables(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args)
	{
		new ConstructorwithVariables(6,5);
	}

}
