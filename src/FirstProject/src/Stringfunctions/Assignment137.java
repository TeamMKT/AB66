package Stringfunctions;
//Write a program to store student name along with their names initials in char and print them in readable format
import java.util.Arrays;
public class Assignment137
{
	public static void main(String[] args)
	{
       String [] name = new String[5];
       name[0]="Rudra";
       name[1]="Ravi";
       name[2]="Renuka";
       name[3]="Radha";
       name[4]="Raja";
       System.out.println(Arrays.toString(name));
       char [] c1 = new char[5];
       c1[0]='G';
       c1[1]='A';
       c1[2]='P';
       c1[3]='K';
       c1[4]='T';
       System.out.println(Arrays.toString(c1));
       for(int i=0;i<5;i++)
       {
    	   System.out.println("Student name:->"+name[i] + "|  Initial:->"+c1[i]);
       }
		

	}

}
