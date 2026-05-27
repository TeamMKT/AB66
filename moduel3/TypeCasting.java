package moduel3;
public class TypeCasting 
{
	public static void main(String[] args) 
	{
		byte a=100;
		
		long a1=	a;//implicit widening
		System.out.println(a1);
		long a2=(long)	a;//Explicit widening
		System.out.println(a2);
		/*
		 * Oracle 2017 CTC:5.6LPA
		 */
		
		/*
		 * super()
		 * this()
		 * Object relation
		 * 
		 */
		//2. Convert int into double	
		int c=1000;
		
		double d1=c;//implicit widening
		System.out.println(d1);
		
		
		double d2=(double)c;//explicit widening
		System.out.println(d2);
		
		
		double q=65.65;
		int w=(int)q;//explicit narrowing
		System.out.println(w);
		
	}
}
