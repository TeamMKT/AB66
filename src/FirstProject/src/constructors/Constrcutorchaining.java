package constructors;

public class Constrcutorchaining 
{
	Constrcutorchaining()
	{
		System.out.println("Default");
	}
	Constrcutorchaining(int a)
	{
		this();
		System.out.println("Parametrized");
	}
	public static void main(String[] args) 
	{
		new Constrcutorchaining(10);
	}
}
