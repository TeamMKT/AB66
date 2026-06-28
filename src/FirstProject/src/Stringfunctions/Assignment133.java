package Stringfunctions;
//Write A Program to accept the array input at run time.
import java.util.Arrays;
import java.util.Scanner;
public class Assignment133
{
	public static void main(String[] args) 
	{
		Scanner s1= new Scanner(System.in);
		System.out.println("Please the enter size of the array:->");
		int [] a = new int[s1.nextInt()];
		for(int i=0; i<a.length;i++)
		{
			System.out.println("Enter the value of the index:->"+i);
			a[i] = s1.nextInt();
		}
		System.out.println("your final array is:->" + Arrays.toString(a));
		s1.close();

	}

}
