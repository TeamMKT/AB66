package Stringfunctions;
//"Write a Program to check the average of the given numbers which are present in your array.
public class Assignment141 
{
	public static void main(String[] args) 
	{
		int [] input = new int[5];
		input[0]=55;
		input[1]=65;
		input[2]=58;
		input[3]=65;
		input[4]=75;
		double sum = 0;
		double average =0;
		for(int i=0;i<input.length;i++)
		{
			sum = sum + input[i];
		}
		System.out.println(sum);
		average=sum/input.length;
		System.out.println(average);
	}

}
