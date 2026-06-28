package continueKeyword;
//Just even numbers from 1 to 200 using continue keyword.					
public class Practice10 
{
public static void main(String[] args)
{
	for(int i=1;i<=200;i++)
	{
		if(i%2==1)
		{
			continue;
		}
		System.out.println(i);
	}
}
}
