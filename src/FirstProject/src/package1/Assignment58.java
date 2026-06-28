package package1;
//"Write a program to calculate grade based on marks: 90+ = A ; 75-89 = B; 50-74=C; Below 50 = Fail ; must use if else and scanner class"
import java.util.Scanner;

public class Assignment58 {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter marks");
		int marks=s1.nextInt();
		if(marks>=90)
		{
			System.out.println("Grade A");
		}
		else if(marks>=75 && marks<=89)
		{
			System.out.println("Grade B");
		}
		else if(marks>=50 && marks<=74)
		{
			System.out.println("Grade C");
		}
		else 
		{
			System.out.println("Fail");
		}
	s1.close();
	}
}


