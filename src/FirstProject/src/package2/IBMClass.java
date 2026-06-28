package package2;

public class IBMClass implements IBM
{

	public void a()     //all the methods present under interface will be public in nature.
	{
		System.out.println("Real logic 1");
	}
	
	public void b() 
	{
		System.out.println("Real logic 2");

		
	}
	public static void main(String[] args) 
	{
		IBMClass a1=new IBMClass();
		a1.a();
		a1.b();
	}

	
}
