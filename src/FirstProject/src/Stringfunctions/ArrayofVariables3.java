package Stringfunctions;

import java.util.Arrays;

public class ArrayofVariables3 
{
	public static void main(String[] args) 
	{
		int [] rollno = new int[4];
		rollno[0]=45;
		rollno[1]=46;
		rollno[2]=55;
		rollno[3]=56;
		System.out.println(Arrays.toString(rollno));
		for(int i=0; i<rollno.length;i++)
		{
			System.out.println(rollno[i]);
		}

	}

}
