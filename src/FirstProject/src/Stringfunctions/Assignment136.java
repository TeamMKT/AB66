package Stringfunctions;
//Write a program to store student name along with their marks in double  and print them in readable format
import java.util.Arrays;
public class Assignment136 
{
	public static void main(String[] args) 
	{
       String [] name = new String[5];
       name[0]="Rudra";
       name[1]="Vivek";
       name[2]="Hemanth";
       name[3]="Khushi";
       name[4]="Kavita";
       System.out.println(Arrays.toString(name));
       double [] marks = new double[5];
       marks[0]=99;
       marks[1]=96;
       marks[2]=85;
       marks[3]=90;
       marks[4]=89;
       System.out.println(Arrays.toString(marks));
       for(int i=0;i<5;i++)
       {
    	   System.out.println("The Student name is :->"+ name[i] +  "& marks is:->" + marks[i]);
       }
       
	}

}
