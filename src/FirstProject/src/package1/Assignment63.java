package package1;
//Write a Program to Check Day of the Week using scanner class in switch concept
import java.util.Scanner;
public class Assignment63
{
   public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter week days");
		String day= s1.next();
		switch(day)
		{
		case "Monday":
			System.out.println("First day of the week");
			break;
		case "Wednesday":
			System.out.println("Mid of the week");
			break;
		case "Friday":
			System.out.println("End of the week");
			break;
		case "Sunday":
			System.out.println("Holiday");
			break;
		default:
			System.out.println("no holiday");
			break;
		}
        s1.close();
	}

}
