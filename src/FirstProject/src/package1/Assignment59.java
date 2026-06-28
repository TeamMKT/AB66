package package1;
//"Write a program to find the largest of two numbers using scanner class"
import java.util.Scanner;

public class Assignment59 {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the number for a");
		int a=s1.nextInt();
		System.out.println("Enter the number for b");
		int b=s1.nextInt();
		if(a>b)
		{
			System.out.println("a is the Largest number");
		}
		else if(a<b)
		{
			System.out.println("b is the Largest number");
		}
		else
		{
			System .out.println("Both the numbers a and b are equal");
		}
	    s1.close();
	}
}
