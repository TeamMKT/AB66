package Stringfunctions;
//"In the given String find out how many are alphabets present?
public class CountofAlpha 
{
	static int countofAlpha =0;
	static int countofNumeric=0;
	static int countofSpace=0;
	static int countofSpecial=0;
	public static void main(String[] args) 
	{
		String name = "k v no 2 @#!";
		char [] c1 = name.toCharArray();
		for(int i=0; i< name.length(); i++)
		{
			boolean b1 = Character.isAlphabetic(c1[i]);
			if(b1)
			{
				countofAlpha++;
			}
			boolean b2 = Character.isDigit(c1[i]);
			if(b2)
			{
				countofNumeric++;
			}
			boolean b3 = Character.isWhitespace(c1[i]);
			if(b3)
			{
				countofSpace++;
			}
			
		}
		System.out.println("Total number of Alphabets:->"+ countofAlpha);
		System.out.println("Total number of Numeric:-"+ countofNumeric);
		System.out.println("Total number of Space:->"+ countofSpace);
		countofSpecial = name.length()-(countofAlpha+countofNumeric+countofSpace);
		System.out.println("Total number od SpecialCharacters:->"+countofSpecial);
		

	}

}
