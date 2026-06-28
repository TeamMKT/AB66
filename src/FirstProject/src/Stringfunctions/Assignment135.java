package Stringfunctions;
import java.util.Arrays;
//Write a program to store student name along with their roll no and print them in readable format
public class Assignment135 
{
	public static void main(String[] args)
	{
		String [] name = new String[5];
		name[0]="Rudra";
		name[1]="Kavita";
		name[2]="Khushi";
		name[3]="Rama";
		name[4]="Roma";
		System.out.println(Arrays.toString(name));
		int [] rollno= new int[5];
		rollno[0]=5;
		rollno[1]=6;
		rollno[2]=7;
		rollno[3]=8;
		rollno[4]=9;
		System.out.println(Arrays.toString(rollno));
		for(int i =0;i<5;i++)
		{
		System.out.println("The Student name:->" + name[i]  +    "& Student rollno:->"+rollno[i]);
		}
	}
}
