package continueKeyword;
//Write a program to print numbers from 1 to 10, but skip both 4 and 7 using continue.
public class Practice4 
{
  public static void main(String[] args) 
  {
     
	for(int i=1;  i<=10;i++)
	{
		if(i==4 || i==7)
		{
			continue;
		}
		System.out.println(i);
	}
	
}
}
