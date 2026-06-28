package package1;
//"Write a program to check whether a number is between 10 and 50 using scanner class to accept run time input"
import java.util.Scanner;

public class Assignment57 
{
		public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=s1.nextInt();
		if (number>=10 && number<=50)
		{
			System.out.println("The number is in between 10 and 50");
		}
		else
		{
			System.out.println("The number is not in between 10 and 50");
		}
	 s1.close();
	}

}
