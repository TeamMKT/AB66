package module1.programs;

public class AmazonProgram
{
	
	AmazonProgram()
	{
		System.out.println("COnstructor 1");
	}
	AmazonProgram(int a)
	{
		System.out.println("COnstructor 2");
	}
	AmazonProgram(int a,double b)
	{
		System.out.println("COnstructor 3");
	}
	AmazonProgram(double a,int b)
	{
		System.out.println("COnstructor 4");
	}
	AmazonProgram(double a,int b,char c)
	{
		System.out.println("COnstructor 5");
	}
	public static void main(String[] args) 
	{
		AmazonProgram a1=	new AmazonProgram();
		AmazonProgram a2=new AmazonProgram(500);
		AmazonProgram a3=new AmazonProgram(500,6.3);
		AmazonProgram A4=new AmazonProgram(4.5,6);
		AmazonProgram a5=new AmazonProgram(4.5,6,'C');
	}
}
