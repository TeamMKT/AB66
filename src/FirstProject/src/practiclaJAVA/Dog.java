package practiclaJAVA;
class Animal
{
	void sound()
	   {
		   System.out.println("Animal Sounds");
	   }
}

public class Dog extends Animal
{
   void bark()
   {
	  System.out.println("Dog sounds bark"); 
   }
   public static void main(String[] args) 
   {
	  Dog a1 = new Dog();
	  a1.sound();
	  a1.bark();
	 
}
}
