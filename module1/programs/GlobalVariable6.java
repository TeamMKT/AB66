package module1.programs;
public class GlobalVariable6 
{
	static int a=100;//Global variable
	public static void main(String[] args) 
	{
		int a=98;//local variable
		System.out.println(a);
		System.out.println(GlobalVariable6.a);
	}
}
