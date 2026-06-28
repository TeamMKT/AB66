package package1;
//If tha smae variable in present locally and globally also?
public class GlobalVariable7 {

	static int a=100; //Global varaible,
	
	public static void main(String[] args) 
		{
			int a=98;//Local variable because it inside the method.
			System.out.println(a);
			System.out.println(GlobalVariable7.a);
		}
	
}