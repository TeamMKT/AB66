package package2;
//Write a Program for hierarchical Level Inheritance
class Assignment_87PC
{
	void mul()
	{
	int a = 15;
	int b = 25;
	int c = a*b;
	System.out.println(c);
	}
}
class Assignment_87CC extends Assignment_87PC
{
	static void add()
	{
		int a = 45;
		int b= 78;
		int c = a+b;
		System.out.println(c);
	}
}

public class Assignment87 extends Assignment_87PC
{
    static void details(String name, int age)
    {
    	String Name=name;
    	int Age = age;
    	System.out.println("Name:"+Name);
    	System.out.println("Age:"+ Age);
    }
public static void main(String[] args) 
{
	Assignment87 m1= new Assignment87();
	m1.mul();
	m1.details("Rudra",18);
	Assignment_87CC m2 = new Assignment_87CC();
	m2.add();
	m2.mul();
	
	
}
}
