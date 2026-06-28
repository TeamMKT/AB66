package interfaces;
interface Animal1
{
	void sound();
}
class Dog1 implements Animal1
{
	@Override
	public void sound()
	{
		System.out.println("Dog barks");
	}
}
 class Cat1 implements Animal1
{
	@Override
	public void sound() 
	{
		System.out.println("Cat meows");
		
	}
public static void main(String[] args) 
{
	Animal1 a1= new Dog1();
	a1.sound();
	Animal1 a2= new Cat1();
	a2.sound();
}
}
