package package1;
//"Write a program to create a class consist of static, Non Static and constructor method and call each of them in a parameterized way."
public class Assignment26 {
	static void add(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	void mul(int a, int b)
	{
		int c=a*b;
		System.out.println(c);
	}
	Assignment26(int a , double b, float c)
	{
		double d=a+b+c;
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		add(15,12);//static method
		Assignment26 n2 = new Assignment26(15,1.25,5.67f); //constructor
		n2.mul(15,15);//non static method
	}
}
 
