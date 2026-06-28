package package1;

import java.util.Scanner;

//Write a program to print numbers from n to 1.
public class ForLoop_scannerclass_practise {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s1.nextInt();
		for (int i=n; i>=1; i--)
		{
			System.out.println(i);
		}
		
	}

}
