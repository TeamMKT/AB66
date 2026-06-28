package continueKeyword;
//"print the numbers from 1 to 200 which is divisible of 4using contine keyword"					
public class Practice12 
{
  public static void main(String[] args) 
  {
	for(int i=1;i<=200;i++)
	{
		if(i%4 !=0)
		{
			continue;
		}
		System.out.println(i);
	}
}
}
