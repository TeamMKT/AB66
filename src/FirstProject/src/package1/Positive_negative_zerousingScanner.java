package package1;
//Write a program to check whether a number is positive, negative, or zero using Scanner.
import java.util.Scanner;

public class Positive_negative_zerousingScanner 
{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=s1.nextInt();
		if(number>0)
		{
			System.out.println("positive");
		}
		else if(number<0)
		{
			System.out.println("negative");
		}
		else
		{
			System.out.println("zero");
		}
	    s1.close();
	}
	

}
