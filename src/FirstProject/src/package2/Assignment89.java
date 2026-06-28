package package2;
//"Write A Program on super calling statement using parameterized super calling statement"
class Assignment89_Pc
{
	Assignment89_Pc(int a, int b)
	{
		int c =a+b;
		System.out.println("sum:"+ c);
	}
}
public class Assignment89 extends Assignment89_Pc
{
	Assignment89(String name)
	{
		super(10,20);
		String Name=name;
		System.out.println("Name:"+ Name);
	}
	public static void main(String[] args) 
	{
		new Assignment89("Rudra");
	}
}
