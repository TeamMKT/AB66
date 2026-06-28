package package2;
//Write a program to create two constructors: Constructor with no parameters; Constructor with one parameter; Both should print different messages.
public class ConstructorOverloading {
	ConstructorOverloading ()
	{
		System.out.println("Constuctor with no parameters");
	}
	ConstructorOverloading(String name)
	{
		System.out.println("Constuctor with  parameters");
	}
	public static void main(String[] args) 
	{
		new ConstructorOverloading();
		new ConstructorOverloading("Constuctor with  parameters");

	}

}
