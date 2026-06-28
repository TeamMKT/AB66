package Stringfunctions;
import java.util.Arrays;
import java.util.Scanner;
public class Arrayofvaraible_Scanner 
{
	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter the size of the array:->");
		String [] name = new String[s1.nextInt()];
		for(int i=0;i<name.length;i++)
		{
			System.out.println("Please enter the value of the index:->"+i);
			name[i]=s1.next();
		}
		System.out.println(Arrays.toString(name));
		s1.close();
	}

}
