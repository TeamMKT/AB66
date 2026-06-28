package package1;
/*"Write a program to create static methods along with a main method that performs addition, subtraction, 
multiplication, division and mode?"*/
public class Assignment7 {
	static void add() 
    {
		int a=100; //declaration and initialization
		int b=200; //declaration and initialization
		int c= a+b; //utilization
		System.out.println(c);
	}
	
	static void sub()
	{
		int c=100;
		int d=200;
		int f=d-c;
		System.out.println(f);
	}
	static void mul()
	{
		int c=100;
		int d=5;
		int e=c*d;
		System.out.println(e);
	}
	static void div()
	{
		int c=10;
		int d=250;
		int f=d/c;
		System.out.println(f);
	}
	static void mod()
	{
		int c=100;
		int d=250;
		int f=d%c;
		System.out.println(f);
	}
	public static void main(String[] args) {
       add();
      sub();
      mul();
      div();
      mod();
	}

}
