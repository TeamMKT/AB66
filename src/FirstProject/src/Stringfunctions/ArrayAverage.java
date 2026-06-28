package Stringfunctions;

public class ArrayAverage {

	public static void main(String[] args) 
	{
		int [] input = new int[5];
		input[0]=45;
		input[1]=55;
		input[2]=65;
		input[3]=75;
		input[4]=85;
		double sum =0;
		double average=0;
		for(int i=0;i<input.length;i++)
		{
			sum = sum+input[i];
		}
		System.out.println(sum);
		average =sum/input.length;
		System.out.println(average);

	}

}
