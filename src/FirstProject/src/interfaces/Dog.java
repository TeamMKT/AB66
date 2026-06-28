package interfaces;
interface Animal
{
	void sound();
}
public class Dog implements Animal
{
	@Override
	public void sound() 
	{
		System.out.println("Dog barks");
	}

public static void main(String[] args)
{
	Animal obj =new Dog();
	obj.sound();
}

}
