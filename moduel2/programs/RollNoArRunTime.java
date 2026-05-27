package moduel2.programs;
import  java.lang.NegativeArraySizeException;
import java.util.Arrays;
import java.util.Scanner;

public class RollNoArRunTime 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter the size of your array:");
		int [] rollno=new int[s1.nextInt()];

		for(int i=0;i<rollno.length;i++)
		{
			System.out.println("Please enter the value at the indexing-> "+i);
		rollno[i]=s1.nextInt();
		}
		System.out.println("Your final Array is->"+Arrays.toString(rollno));
		s1.close();
	}
}
