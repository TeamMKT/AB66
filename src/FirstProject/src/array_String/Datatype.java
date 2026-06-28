package array_String;

import java.util.Arrays;

public class Datatype {

	public static void main(String[] args) 
	{
		int [] rollno = new int [5];
		rollno[0]=45;
		rollno[1]=55;
		rollno[2]=58;
		rollno[3]=65;
		rollno[4]=85;
		System.out.println(Arrays.toString(rollno));
		String [ ] name = new String [5];
		name [0] = "Roma";
		name [1] = "Geeta";
		name [2] = "Anu";
		name [3] = "Kavita";
		name [4] = "Divya";
		System.out.println(Arrays.toString(name));
		for(int i=0;i<5;i++)
		{
			System.out.println("My name is: ->"+name[i]+" & My Roll No is:->" + rollno[i]);
		}
	}

}
