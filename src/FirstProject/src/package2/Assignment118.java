package package2;
//Write A Program on method overriding
class Assg118
{
	void show()
	{
		
		System.out.println("Inside Parent class");
	}
}
public class Assignment118 extends Assg118
{
	void show()
	{
		System.out.println("Inside child class");
	}
	public static void main(String[] args) 
	{
		Assignment118 obj = new Assignment118();
		obj.show();

	}

}
