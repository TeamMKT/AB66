package moduel2.programs;

import java.util.Arrays;

public class ArrayProgram2 
{
	 public static void main(String[] args) 
	{
		 
		 //datatype [] variable=new datatype[size];			
		 int [] rollno=new int[4];
		 rollno[0]=45;
		 rollno[1]=48;
		 rollno[2]=78;
		 rollno[3]=10;
		 rollno[4]=5;
		 System.out.println(Arrays.toString(rollno));
		 
		 for(int i=0;i<rollno.length;i++)
		 {
			System.out.println(rollno[i]);
		 }
		 
		 
		 
		 
	}
}
