package package1;
//"Write a program to check whether a year is a century year (divisible by 100) by accepting run time input"
import java.util.Scanner;

public class Assignment55 {

	public static void main(String[] args) 
	{
		Scanner S1=new Scanner(System.in);
		System.out.println("Enter the year");
		int year=S1.nextInt();
		if(year % 100==0)
		{
			System.out.println("The year is a centuary year");
		}
		else
		{
			System.out.println("The year is not a centuary year");
		}
        S1.close();
	}

}
