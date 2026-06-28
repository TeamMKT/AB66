package package1;
//"Write a program to check whether a person is eligible for a senior citizen discount by accepting run time input(age ≥ 60)."
import java.util.Scanner;

public class Assignement54 {

	public static void main(String[] args)
	{
		Scanner s1= new Scanner(System.in);
	
		System.out.println("Enter age");
		int age=s1.nextInt();
		
		if(age >=60)
		{
			System.out.println("Eligible for a senior citigen discount");
		}
		else
		{
			System.out.println("not eligible for a senior citigen discount");
		}
       s1.close();
	}

}
