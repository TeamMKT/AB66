package module1.programs;
public class IfBlock2 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		int c=30;
		if(a!=b)//true
		{
			System.out.println("Block 1 will execute");
		}
		System.out.println("In Middle");
		if(a==b)//false
		{
			System.out.println("Block 2 will execute");
		}
		if(a>=b)//false
		{
			System.out.println("Block 3 will execute");
		}
		if(a<=b)//true
		{
			System.out.println("Block 4 will execute");
		}
		if(a>b)//false
		{
			System.out.println("Block 5 will execute");
		}
		if(a<b)//true
		{
			System.out.println("Block 6 will execute");
		}
		
	}
}
