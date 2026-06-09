package module1.programs;
public class GlobalVariable4 
{
	static int a=100;//Global variable
	int b=10;//Global variable-Instance Variable
	public static void main(String[] args) 
	{
		System.out.println(a);
		GlobalVariable4 g1=new GlobalVariable4();
		System.out.println(g1.b);
	}
}
