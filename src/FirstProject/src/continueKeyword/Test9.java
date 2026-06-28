package continueKeyword;

public class Test9 
{
  public static void main(String[] args)
  {
	for(int i=1;i<=50;i++)
	{
		if(i%10==7)
		{
			continue;
		}
		System.out.println(i);
	}
	
}
}
