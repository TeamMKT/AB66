package practiclaJAVA;

import java.util.Arrays;

public class ArrayPractice1 
{
	public static void main(String[] args)
	{
   int [] a1 = new int [5];
   a1 [0]=12;
   a1 [1]=45;
    a1[2]=7;
    a1[3]=89;
    a1[4]=23;
    int largest = a1[0];
    System.out.println(Arrays.toString(a1));
    for(int i =1;i<a1.length;i++)
    {
    	if(a1[i]>largest)
    	{
    		largest=a1[i];
    	}
    	
    }
    System.out.println("Largest element is:" + largest);

	}
   }
