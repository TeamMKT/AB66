package package1;
//"Write a program to check whether a number is even or odd using run time input and if else block"
import java.util.Scanner;
public class Assignment51
{
public static void main(String[] args) 
{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter a number n value");
		int number= s1.nextInt();
		if (number % 2==0)
		{
			System.out.println("The number is even");
		}
		else
		{
			System.out.println("The number is odd");
		}

	  s1.close();
}

}
