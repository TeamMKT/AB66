package package2;
//Write A Program on Super Keyword
class Assg119
{
	void display()
	{
		System.out.println("This is Parent class method");
	}
}
public class Assignment119 extends Assg119
{
	void display()
	{
		super.display();
		System.out.println("This is child class method");
	}

	public static void main(String[] args) 
	{
		Assignment119 obj = new Assignment119();
		obj.display();

	}

}
