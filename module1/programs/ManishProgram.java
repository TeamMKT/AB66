package module1.programs;
public class ManishProgram 
{
	static double add(int a,int b)
	{
		int sum=a+b;
		return sum;
		
		
	}
	
	public static void main(String[] args) 
	{
		//String->NO
		//System->NO
		
		int sum=Math.addExact(874, 265);
		System.out.println(sum);
		
		int sub=	Math.subtractExact(200, 50);
		System.out.println(sub);
		
		
		int mul=	Math.multiplyExact(10, 50);
		System.out.println(mul);
		
		
		
		int smaller=	Math.min(45, 30);
		
			System.out.println(smaller);
			
		int maximum=	Math.max(45,85);
		System.out.println(maximum);	
		//
		//
		
		int newvalue=	Math.abs(900);
		System.out.println(newvalue);
		
		double d1=	Math.sqrt(85);
		System.out.println(d1);
		
		double d2=	Math.random();
		System.out.println(d2);
		// 0 and 1->double-17 to 19
		double areaOfCircle=Math.PI*10*10;
		System.out.println(areaOfCircle);
		
		
		
		
	}
}
