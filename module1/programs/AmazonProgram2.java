package module1.programs;

public class AmazonProgram2
{
	
	AmazonProgram2()
	{
		System.out.println("COnstructor 1");
	}
	AmazonProgram2(int a)
	{
		System.out.println("COnstructor 2");
	}
	AmazonProgram2(int a,double b)
	{
		System.out.println("COnstructor 3");
	}
	AmazonProgram2(double a,int b)
	{
		System.out.println("COnstructor 4");
	}
	AmazonProgram2(double a,int b,char c)
	{
		System.out.println("COnstructor 5");
	}
	public static void main(String[] args) 
	{
		AmazonProgram2 a1=	new AmazonProgram2();

	}
}
