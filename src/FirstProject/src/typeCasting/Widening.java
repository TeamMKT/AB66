package typeCasting;

public class Widening {

	public static void main(String[] args) 
	{
		byte a =100;
		long a1 = a;//implicit widening
		System.out.println(a1);
		
		byte b =100;
		long a2 = (long)b; //Explicit widening
		System.out.println(a2);
		
	}

}
