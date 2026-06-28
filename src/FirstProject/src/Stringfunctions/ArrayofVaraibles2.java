package Stringfunctions;

import java.util.Arrays;

public class ArrayofVaraibles2
{
	public static void main(String[] args)
	{
		int [] rollno = new int[5];
		rollno[0]=45;
		rollno[1]=45;
		rollno[2]=45;
		rollno[3]=45;
		rollno[4]=45;
		System.out.println(Arrays.toString(rollno));
		String [] name = new String[5];
		name[0]="Rudra";
		name[1]="Ravi";
		name[2]="Anu";
		name[3]="Kavita";
		name[4]="Geeta";
		System.out.println(Arrays.toString(name));
		for(int i=0;i<5;i++)
		{
			System.out.println("My name is : ->" + name[i]  + "& My rollno is : ->"+rollno[i]);
		}
		
	}

}
