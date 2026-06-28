package Stringfunctions;
//Write A Program to count the number of alphabets are present in the String
public class Assignment143 
{
	public static void main(String[] args)
	{   
		int a = 0;
		String name = "Rudra @ 2007";
		char [] c1 = name.toCharArray();
		for(int i=0;i<name.length();i++)
		{
			boolean b1 = Character.isAlphabetic(c1[i]);
			if(b1)
			{
				a++;
			}
		}
		System.out.println("Total number of Alphabets:->"+ a);
	}

}
