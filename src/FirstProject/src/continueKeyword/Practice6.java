package continueKeyword;
//Write a program to print numbers from 1 to 10, but skip numbers 
//whose last digit is 5.
public class Practice6 
{
   public static void main(String[] args)
   {
	  for(int i=1;i<=10;i++)
	  {
		  if(i%10==5)
		  {
			  continue;
		  }
		  System.out.println(i);
	  }
}
}
