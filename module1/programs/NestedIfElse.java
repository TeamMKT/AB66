package module1.programs;

import java.util.Scanner;

public class NestedIfElse 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("PLease enter your gender:");
		String gender1=s1.next();

		System.out.println("PLease enter your Salary:");

		double salary=s1.nextDouble();
		
		if(gender1.equalsIgnoreCase("female"))//this method is done yet
		{
			System.out.println("You are eligible");
			System.out.println("PLease click on Apply: To check if you can avail it");
			if(salary<=25000)
			{
				System.out.println("Congratulation!!");
			}
			else
			{
				System.out.println("Sorry this is not eligible for someone whose salary is greater then 25k");
			}
		}
		else
		{
			System.out.println("Sorry this is NOT for you");
		}
		s1.close();
		
		
		
		
	}
}
