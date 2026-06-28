package package2;
/*Write a program for constructor inheritance- Multi level using a parameterized super calling statement 
with explicit invocation*/
class Gps85
{
	Gps85(String name, int age)
	{
		String Name=name;
		int Age = age;
		System.out.println("Name:"+ name);
		System.out.println("Age:"+age);
	}
}
class Ps85 extends Gps85
{
	Ps85()
	{
		super("Rudra",18);
		System.out.println("Education= Btech II year" );
	}
}
public class Assignment85 extends Ps85
{
	Assignment85()
	{
		super();
		System.out.println("Course Name=CSE");
	}

	public static void main(String[] args)
	{
		new Assignment85();

	}

}
