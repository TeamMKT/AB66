package methodoverridding;
class Vehicle
{
	void run()
	{
		System.out.println("Vehicle is running");
	}
}

public class Car extends Vehicle
{
    void run()
    {
		System.out.println("Car run:"+ "Car is running fast");
    }
	public static void main(String[] args) 
	{
		Vehicle g1=new Car();
		g1.run();

	}

}
