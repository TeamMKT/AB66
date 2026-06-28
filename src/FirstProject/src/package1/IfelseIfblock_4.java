package package1;
public class IfelseIfblock_4 
{
public static void main(String[] args) 
   {
	int a=45;
	int b=78;
	int c=89;
	if(a>=c)//false
	{
		System.out.println("Statement 1");
	}
	else if(b!=c)//true
	{
		System.out.println("Statement 2");
	}
	else if(a!=b)//true
	{
		System.out.println("Statement 3");
	}
	else if (a>b)//true
	{
		System.out.println("Statement 4");
	}
	else
	{
		System.out.println("Statement 6");
	}
}
}