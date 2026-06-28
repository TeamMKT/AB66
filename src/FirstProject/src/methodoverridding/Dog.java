package methodoverridding;

class Animal
{
	void sound()
	{
		System.out.println("Animal sound");
	}
}
public class Dog extends Animal
{
	void sound()
	{
		System.out.println("Dog Sound:" + "Dog barks");

	}

   public static void main(String[] args) 
   {
	   Dog a1 = new Dog();
	   a1.sound();

	}

}
