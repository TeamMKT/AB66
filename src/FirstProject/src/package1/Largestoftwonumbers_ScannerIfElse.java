package package1;
//Write a program to find the largest of two numbers using Scanner and if-else.
import java.util.Scanner;

public class Largestoftwonumbers_ScannerIfElse {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter number a");
		int a=s1.nextInt();
		System.out.println("Enter number b");
		int b=s1.nextInt();
		if(a<b)
		{
			System.out.println(b + "largest number");
		}
		else if (a>b)
		{
			System.out.println(a + "largest number");
		}
		else
		{
			System.out.println("both numbers are equal");
		}
		
		s1.close();
	}

}
