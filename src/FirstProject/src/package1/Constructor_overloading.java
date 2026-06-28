package package1;
//Write a program to demonstrate constructor overloading.Create:Default constructor; Parameterized constructor
public class Constructor_overloading {

	Constructor_overloading()
	{
		System.out.println("Rudra");
	
	}
	Constructor_overloading(String Name, int age)
	{
		String name=Name;
		  int age1=age;
		System.out.println(name);
		System.out.println(age1);
	
	}
	public static void main(String[] args) 
	{
		new Constructor_overloading ();
		new Constructor_overloading("Rudra",18);

}
}
