package moduel2.programs;
public class PalindromeProgram 
{
	public static void main(String[] args) 
	{
		String input="madam";
		String output="";//cba

		for(int i=input.length()-1;i>=0;i--)
		{
			char c1=	input.charAt(i);
			output=output+c1;
		}
		System.out.println("My Input is-> "+input);
		System.out.println("My Output is-> "+output);
/*
		boolean b1=	input.equals(output);
		if(input.equals(output)==true)
		if(b1)
		if(b1==true)
*/	
		if(input.equals(output))
		{
			System.out.println("It is a Palindrome");
		}
		else
		{
			System.out.println("It is not Palindrome");
		}

		
	}
}
