package moduel3;
public class TypeCasting2 
{
	public static void main(String[] args) 
	{
		Object o1=	new TypeCasting2();//Upcasting Implictely
		
		
		Object o2=(Object)	new TypeCasting2();//upcasting Explictely
		
		
		TypeCasting2  t1=(TypeCasting2) o1;//Explicit Downcasting
		
	/*	Note:
		Downcasting is only possibel once Upcastings is done	
		/*
		 * SUperClass s1=new ChildClass();				
SUperClass s1=(SUperClass )new ChildClass();				
Syntax Of Downcasting:				
ChildClass c1=(ChildClass )s1;				
		 */
	}
}
