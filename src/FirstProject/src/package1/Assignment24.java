package package1;
//""Write a program on method Overloading with 5 static method and 5 non static method"
public class Assignment24
{
	static void add()
	{
		System.out.println("The static method");
	}
	static void add (int a , int b)
	{
		int c =a+b;
		System.out.println(c);
	}
	static void add (int a, int b, int c)
	{
		int d =a+b+c;
		System.out.println(d);
	}
	static void add(double a, double b)
	{
		double c =a+b;
		System.out.println(c);
	}
	static void add(double a, float b)
	{
		double c = a+b;
		System.out.println(c);
	}
	void add(int x, int y, double z)
	{
		double p = x+y+z;
		System.out.println(p);
	}
	void add (double p, double q, double r)
	{
		double s = p+q+r;
		System.out.println(s);
	}
	void add(char i, char j)
	{
		int k = i+j;
		System.out.println(k);
	}
	void add(char i, String j)
	{
		System.out.println("Character:"+i);
		System.out.println("String:"+j);
	}
	void add(double a, long b)
	{
		double c =a+b;
		System.out.println(c);
	}
		public static void main(String[] args) 
		{		
			add();
			add(10,20);
			add(15,45,68);
			add(1.25,4.56);
			add(1.25,4.56f);
			Assignment24 a1=new Assignment24();
			a1.add(15, 25, 3.25);
			a1.add(1.25, 2.25, 3.56);
			a1.add('i','j');
			a1.add('G', "Rudra");
			a1.add(1.25, 2567489l);
		}

	}
