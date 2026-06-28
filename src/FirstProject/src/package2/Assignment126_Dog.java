package package2;
/*Write a program to create relationship between class and abstract class , abstract class and interface
(Multi level inheritence)*/

interface AnimalActions
{
	abstract void eat();
}
abstract class Animal implements AnimalActions
{
	abstract void sound();
}
public class Assignment126_Dog extends Animal
{
	@Override
	public void eat() 
	{
		System.out.println("Dog eat meat ");
	}
	@Override
	void sound() 
	{
		System.out.println("Dog sounds bark");
	}
	public static void main(String[] args) 
	{
		Assignment126_Dog obj = new Assignment126_Dog();
		obj.eat();
		obj.sound();

	}

	

}
