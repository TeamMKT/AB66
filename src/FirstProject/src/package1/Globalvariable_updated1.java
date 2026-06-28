package package1;
//How to update the global variable
public class Globalvariable_updated1 {

	static int a=100; //Global varaible,
	int b = 10;// instance varaible
	public static void main(String[] args) 
		{
			a=101;
			System.out.println(a);
			Globalvariable_updated1 a1=new Globalvariable_updated1();
			System.out.println(a1.b=500);
		}
	
}


