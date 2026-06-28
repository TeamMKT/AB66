package Stringfunctions;

public class ArrayAverage1 
{
     double sum;
     double average;
	public static void main(String[] args) 
	{
		int [] input = new int[5];
		input[0]=45;
		input[1]=55;
		input[2]=65;
		input[3]=75;
		input[4]=85;
		ArrayAverage1 a1=new ArrayAverage1 ();
		/*System.out.println(a1.sum);
		System.out.println(a1.average);*/
		
		for(int i=0;i<input.length;i++)
		{
			a1.sum = a1.sum+input[i];
		}
		System.out.println(a1.sum);
		a1.average =a1.sum/input.length;
		System.out.println(a1.average);

	}

}
