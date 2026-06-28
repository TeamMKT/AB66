package continueKeyword;

public class Practice9 
{
  public static void main(String[] args) 
  {
	for(int i=1;i<=10;i++)
	{
		if(i==2 || i==3||i==5||i==7)
		{
			continue;
		}
		System.out.println(i);
	}
}
}
