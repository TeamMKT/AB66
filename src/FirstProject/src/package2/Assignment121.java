package package2;
//Write A Program to avoid Method Overiding using Final Method
class Assg121
{
	final void display()
	{
		System.out.println("This is Parent class method");
	}
}
public class Assignment121 extends Assg121
{
	void show()
	{
		System.out.println("THis is Child class method");
	}
public static void main(String[] args)
{
	Assignment121 obj =new Assignment121();
	obj.show();
	obj.display();

	}

}
