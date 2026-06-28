package package2;

public class ThisCalling_Amazon
{
	ThisCalling_Amazon()
		{
		   this(10,12.5);
			System.out.println("COnstructor 1");
		}
	ThisCalling_Amazon(int a)
		{
		   
			System.out.println("COnstructor 2");
		}
	ThisCalling_Amazon(int a,double b)
		{
			this(10);
		   System.out.println("COnstructor 3");
		   
		}
	
	public static void main(String[] args) 
	{
		new ThisCalling_Amazon();
	}
	
}
	
	
	
	
	
	
	
	
	