package continueKeyword;
//"Just odd numbers from 1 to 200; using contine keyword"					
public class Practice11
{
  public static void main(String[] args) 
  {
	for(int i=1; i<=200;i++)
	{
		if(i%2==0)
		{
			continue;
		}
		System.out.println(i);
	}
}
}
