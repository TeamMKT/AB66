package package1;
//Write a program to check whether a number is EVEN or ODD using Scanner.
import java.util.Scanner;

public class Evenorodd_scannerclassIfElse 
{
public static void main(String[] args)
{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter a number");
		int number=s1.nextInt();
		if (number % 2==0)
		{
			System.out.println("Even number");
		}
		else
		{
			System.out.println("Odd number");
		}
		s1.close();
	}

}
