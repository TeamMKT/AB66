package practiclaJAVA;

import java.util.Arrays;

public class Practice2 
{
  public static void main(String[] args) 
  {
	int [] a1 = new int [5];
	a1[0]=45;
	a1[1]=58;
	a1[2]=15;
	a1[3]=26;
	a1[4]=78;
	System.out.println(Arrays.toString(a1));
	int largest = a1[0];
	int secondLargest = a1[0];
	
	for(int i=1;i<a1.length;i++)
	{
		if(a1[i]>largest)
		{
			secondLargest = largest;
			secondLargest = a1[i];
		}
		else if(a1[i] > secondLargest && a1[i] != largest)
        {
            secondLargest = a1[i];
        }
    }
	System.out.println("SecondLargest elemtent is:" + secondLargest);
	}
	
}

