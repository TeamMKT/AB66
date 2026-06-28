package package1;

public class IfElseif_block {

	public static void main(String[] args)
	{
		int a=15;
		int b=25;
		int c=40;
		if (a==b)
		{
			System.out.println("Method1");
		}
		else if(a>=b)
		{
			System.out.println("Method2"); 	
		}
		else
		{
			System.out.println("Method3");
		}
	}

}
/*Here, we can observe the first two conditions are false so, else statement will execute. Otherwise the first two statements are true
it will execute which block is true first that block will execute*/