package package2;
//"Write A Program on super calling statement using non-parameterized super calling statement"
class Assignment88_PC
{
	Assignment88_PC()
	{
		String Name = "Rudra";
		int age = 18;
		System.out.println("Name:"+ "Rudra");
		System.out.println("Age:"+ 18);
	}
}
public class Assignment88 extends Assignment88_PC
{
	Assignment88()
	{
		//super();  //non paramtrizes super calling use it here implicitly
		String course = "BTech";
		String Branch="CSE";
		System.out.println("Course:"+"BTech");
		System.out.println("Branch:"+"CSE");
	}
	public static void main(String[] args) 
	{
		new Assignment88();
	}
		
}
