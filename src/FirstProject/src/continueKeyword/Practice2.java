package continueKeyword;
//Write a Java program using continue to print numbers from 1 to 10, but skip even numbers.
public class Practice2 
{
  public static void main(String[] args)
  {
	for(int i=1;i<=10;i++)
	{
		if(i % 2==0)
		{
			continue;
		}
		System.out.println("Without even numbers:" +i);
	}
}
}
