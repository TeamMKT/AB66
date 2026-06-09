package moduel2.programs;
import java.util.Arrays;

public class ArrayProgram 
{
	 public static void main(String[] args) 
	{
		 
		 //datatype [] variable=new datatype[size];			
		 int [] rollno=new int[5];
		 rollno[0]=45;
		 rollno[1]=48;
		 rollno[2]=78;
		 rollno[3]=10;
		 rollno[4]=5;
		 System.out.println(Arrays.toString(rollno));
		 
		 String name[]=new String[5];
		 name[0]="Sona";
		 name[1]="Aniket";
		 name[2]="Aishwarya";
		 name[3]="Biswajit";
		 name[4]="Prerna";
		 System.out.println(Arrays.toString(name));

		 for(int i=0;i<5;i++)
		 {
			System.out.println("My name is-> "+name[i] +"& My Roll No is->  "+ rollno[i]);
		 }
		 
		 
		 
		 
	}
}
