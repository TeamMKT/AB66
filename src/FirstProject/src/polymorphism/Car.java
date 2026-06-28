package polymorphism;
class Vehicle
{
	void start()
	{
		System.out.println("Vehicle starts");
	}
}
public class Car extends Vehicle
{
    void start()
    {
    	System.out.println("Car starts with key");
    }
    
    public static void main(String[] args)
    {
    	Vehicle v = new Car();
    	v.start();
	}
}
