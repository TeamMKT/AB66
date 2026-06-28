package package2;
/*Write a program for constructor inheritance- multi level using a non parameterized super calling statement with 
implicit invocation*/
class Gps84
{
	Gps84()
	{
		String Name="Rudra";
		System.out.println("Name:"+ Name);
	}
}
class Ps84 extends Gps84
{
	Ps84()
	{
	int age = 18;
	System.out.println("Age:"+ age);
}
}
public class Assignment84 extends Ps84
{
	Assignment84()
	{
		System.out.println("Education=Btech II year");
	}
	public static void main(String[] args) 
	{
		new Assignment84();
	}
}
