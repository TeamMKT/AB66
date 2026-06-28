package package1;
//"Write a program using nested if; If salary > 50,000 → check years of experience;If experience > 5 → give bonus;Else → no bonus;use scanner class to accept run time input"
import java.util.Scanner;
public class Assignment67 
{
public static void main(String[] args) 
{
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter salary");
	int salary=s1.nextInt();
	System.out.println("Enter experience");
	int experience = s1.nextInt();
	if (salary>50000)
	  {
		System.out.println("Check years of experience");
	     if(experience>5)
	       {
		   System.out.println("give bonus");
	       }
	     else
	       {
		   System.out.println("No bonus");
	       }
}
    else
{
	System.out.println("salary not eligible for bonus");
}
s1.close();
	
	}

}
