package package2;
//Write A Program on Interface with 2 Abstract methods
interface Vehicle_1
{
	abstract void start();
	abstract void stop();
}
public class Assignment124_Bike implements Vehicle_1
{
	@Override
	public void start()
	{
		System.out.println("Bike starts with keys");
	}

	@Override
	public void stop() 
	{
		System.out.println("Bike stops");
	}

	public static void main(String[] args)
	{
		Assignment124_Bike obj = new Assignment124_Bike();
		obj.start();
		obj.stop();
	}
}
