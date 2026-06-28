package nestedIf;
//Check age If age ≥ 18 → check if has voter ID;Print eligible / not eligible
import java.util.Scanner;

public class Votingeligibility
{
	public static void main(String[] args) 
	{
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter an age");
		int age = s1.nextInt();
		 //System.out.println("Do you have voter ID? (true/false):");
		boolean hasVoterID = s1.nextBoolean();
		
		if (age>=18)
		{
			System.out.println("eligible");
			if(hasVoterID)
			{
				System.out.println("Eligible for vote");
			}
			else
			{
				System.out.println("Not Eligible for vote");
			}
		}
		else
		{
			
			System.out.println("Not eligible");
	
		}
		s1.close();

	}

}
