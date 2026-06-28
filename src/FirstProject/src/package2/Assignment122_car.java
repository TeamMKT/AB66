package package2;
//Write A Program on Abstract Class and Abstract Method
abstract class Vehicle
{
	abstract void start();
	void fuel()
	{
		System.out.println("Fuel is required");
	}
}
public class Assignment122_car extends Vehicle 
{
	@Override
	void start() 
	{
		System.out.println("Car starts with key");
	}
    
	public static void main(String[] args) 
	{
		Assignment122_car obj = new Assignment122_car();
		obj.start();
		obj.fuel();

	}

	

}
