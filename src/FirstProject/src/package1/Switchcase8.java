package package1;

import java.util.Scanner;

public class Switchcase8 {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter week days");
		String day = s1.next();
		switch(day)
		{
		case "Monday":
			System.out.println("Starting of week");
			break;
		case "Wednesday":
			System.out.println("3rd of week");
			break;
		case "Friday":
			System.out.println(" weekend is near");
			break;
		case "Sunday":
			System.out.println("Holiday");
			break;
		default:
			System.out.println("Normalday");
		}
	s1.close();
		

	}

}
