package package1;
//"Write a Program to check person can vote only if he/she is 18 or above and should not vote if age is less
//  using run time input".
import java.util.Scanner;
public class Assignment50 
{
   public static void main(String[] args) 
   {
		Scanner s1=new Scanner(System.in);
		 System.out.println("Enter your age");
		int age = s1.nextInt();
		if (age>=18)
		{
			System.out.println("you can vote");
		}
		else
		{
			System.out.println("you cannot vote");
		}
		s1.close();
	}

}
