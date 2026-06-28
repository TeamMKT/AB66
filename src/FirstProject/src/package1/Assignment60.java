package package1;
//"Write a program to calculate electricity bill:If units ≤ 100 → ₹5/unit; If units > 100 → ₹10/unit; must use scanner class to accept run time input"
import java.util.Scanner;

public class Assignment60 {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the units of the electricity bill");
		int units = s1.nextInt();
		int bill;
		if (units<=100)
		{
			bill=units*5;
		}
		else
		{
			bill =units*10;
		}
        System.out.println("Electricity bill=₹"+bill);
        s1.close();
	}

}
