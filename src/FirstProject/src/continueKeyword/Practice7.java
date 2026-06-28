package continueKeyword;
//Write a Java program using continue to print numbers from 1 to 10, 
//but skip numbers divisible by 3.
public class Practice7 
{
   public static void main(String[] args) 
   {
	  for(int i=1;i<=10;i++)
	  {
		  if(i%3 == 0)
		  {
			  continue;
		  }
		  System.out.println(i);
	  }
}
}
