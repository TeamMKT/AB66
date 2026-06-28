package continueKeyword;
//Write a Java program using continue to print numbers from 1 to 15,
//but skip all numbers from 5 to 10 (inclusive).
public class Practice5 
{
 public static void main(String[] args)
 {
	 for(int i=1;i<=15;i++)
	  {
		  if(i>=5 && i<=10)
		  {
			  continue;
		  }
		  System.out.println(i);
	  }
}
}
