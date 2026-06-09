package moduel2.programs;
public class ArrayAverage 
{
	public static void main(String[] args) 
	{
		int [] input=new int[2];
		input[0]=96;
		input[1]=86;
		input[2]=100;
		input[3]=90;
		double sum=0;
		double average=0;
		
		for(int i=0;i<input.length;i++)
		{
			sum=sum+input[i];
			/*i=0,sum=45
			 * i=1,sum=100
			 * i=2,sum=145
			 * i=3,sum=200
			 */
		}
		System.out.println(sum);
		average=sum/input.length;
		System.out.println(average);
				
		
		
		

	}
}
