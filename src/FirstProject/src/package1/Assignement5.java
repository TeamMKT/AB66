package package1;
//"Write a program with combination of 2 static parameterized and 2 nonparameterizedmethods and try calling all of them in main method"?
public class Assignement5 {

	static void add(int a,int b)
	{
		int c = a+b;
		System.out.println(c);
	}
	static void add(double a,double b)
	{
		double c = a+b;
		System.out.println(c);
	}
	static void geeta()
	{
		System.out.println("Automation testing1");
	}
	static void rudra()
	{
		System.out.println("Automation testing2");
	}
	public static void main(String[] args) 
	{
		add(25,26);
		add(1.25,2.56);
		geeta();
		rudra();

	}

}
