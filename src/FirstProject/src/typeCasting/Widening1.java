package typeCasting;
//float into double 
public class Widening1 {

	public static void main(String[] args) 
	{
		float a = 10.567f;
		double a1 = a; //implicit
		System.out.println(a1);
		float a2 = 5.256f;
		double a3 = (double)a2; //explicit
		System.out.println(a3);
		

	}

}
