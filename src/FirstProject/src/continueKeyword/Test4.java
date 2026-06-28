package continueKeyword;

public class Test4 
{
  public static void main(String[] args) 
  {
	for(int i=1;i<=10;i++)
	{
		if(i%10==3)
		{
			continue;
		}
		System.out.println(i);
	}
}
}
