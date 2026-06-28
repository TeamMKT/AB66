package Stringfunctions;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayofVaraibles_Scannerclass 
{
	public static void main(String[] args) 
	{
		Scanner S1 = new Scanner(System.in);
		System.out.println("Please enter the size of your array:->");
		int [] rollno = new int[S1.nextInt()];
		for(int i=0;i<rollno.length;i++)
		{
			System.out.println("Please enter the index value:->"+i);
			rollno[i]=S1.nextInt();
		}
		System.out.println("yorr final array is:->" + Arrays.toString(rollno));
		S1.close();

	}

}
