package continueKeyword;
//Write a program to print numbers from 1 to 10, 
//but skip numbers divisible by both 2 and 3.
public class Practice8 
{
 public static void main(String[] args)
 {
	 for(int i=1;i<=10;i++)
	  {
		 if(i %6==0 ) 
		 {
			 continue;
		 }
		 System.out.println(i);
	  }
}
}
