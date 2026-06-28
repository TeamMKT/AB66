package practiclaJAVA;
 abstract class Vehicle
 {
	 abstract void start();
 }
 class Car extends Vehicle
 {
	@Override
	void start() {
		System.out.println("Car starts with keys");
	}
 }
public class Bike extends  Vehicle 
{
	@Override
	void start() 
	{
		System.out.println("Bike starts with keys");
		
	}
	public static void main(String[] args) 
	{
		
		Vehicle obj = new Bike();
		obj.start();
		Vehicle obj1 = new Car();
		obj1.start();
	}

}
