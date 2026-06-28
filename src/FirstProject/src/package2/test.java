package package2;

import java.util.Scanner;

/*"Write a program to calculate electricity bill:
If units ≤ 100 → ₹5/unit
If units > 100 → ₹10/unit
must use scanner class to accept run time input"*/

public class test 
{
	
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the units");
		int units = s1.nextInt();
		int Bill;
		
		if (units<=100 )
		{
		     Bill=units*5;
			
		}
		else 
		{
			Bill=units*10;
		}
		System.out.println("Calculated Electricty Bill:"+ Bill);
		
       s1.close();
	}

}
