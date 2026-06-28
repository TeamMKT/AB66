package package1;
//"Write a program to create 3 Non-Static non parameterized Methods and call them in main method with a single reference variable"
public class Assignement15 {

	void add()
	{
		int a = 15;
		int b = 20;
		int c= a+b;
		System.out.println(c);
	}
	void sub()
	{
		int a = 15;
		int b = 20;
		int c= b-a;
		System.out.println(c);
	}
	void mul()
	{
		float a = 15.645f;
		float b = 20.456f;
		float c= a*b;
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		Assignement15 n1 = new Assignement15();
		n1.add();
		n1.sub();
		n1.mul();

	}

}
