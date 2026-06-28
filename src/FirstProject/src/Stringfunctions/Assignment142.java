package Stringfunctions;
//Write a Program to Check if the given Array if the value 100 is present at index also find out its indexing
public class Assignment142
{
	public static void main(String[] args)
	{
	 int [] input = new int[6];
	 input[0]=85;
	 input[1]=75;
	 input[2]=48;
	 input[3]=100;
	 input[4]=65;
	 input[5]=100;
	 int numberTocheck=100;
	 for(int i=0;i<input.length;i++)
	 {
		 if(input[i]==numberTocheck)
		 {
			 System.out.println("Yes the given number is part of the array");
			 System.out.println("At the given index:->"+i);
		 }
	 }
	 

	}

}
