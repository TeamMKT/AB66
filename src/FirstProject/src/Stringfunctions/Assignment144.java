package Stringfunctions;
//Write A Program to count the number of numeric values present in the String
public class Assignment144 
{
	public static void main(String[] args) 
	{
		int a =0;
		String name = "Rudra @ 2007";
		char [] c1 = name.toCharArray();
		for(int i =0;i<name.length();i++)
		{
			boolean b1 = Character.isDigit(c1[i]);
			if(b1)
			{
				a++;
			}
		}
		System.out.println("Total number of numeric values:->"+a);

	}

}
