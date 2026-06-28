package Stringfunctions;
//Write A Program to count the special charactaers present in the String.
public class Assignment145 
{
	public static void main(String[] args) 
	{
		String name = "Rudra 2007 #$@";
		int a =0;
		char [] c1 = name.toCharArray();
		for(int i=0; i<name.length();i++)
		{
			if(!Character.isAlphabetic(c1[i])&&(Character.isDigit(c1[i]))&&(!Character.isWhitespace(c1[i])))
			{
				a++;
			}
		}
        System.out.println("Total number of Characters :->"+a);
	}

}
