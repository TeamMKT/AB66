package stringFunctionsPractice;
public class Palindrome 
{
	public static void main(String[] args) 
	{
		String input = "madam";
		String output="";
		for(int i=input.length()-1;i>=0;i--)
		{
			char c1 = input.charAt(i);
			output = output+c1;
		}
        System.out.println("My input name is:->"+input);
        System.out.println("My output name is:->"+output);
        if(input.equals(output))
        {
        	System.out.println("The given name is Palindrome");
        }
        else
        {
        	System.out.println("The given name is not a Palindrome");
        }
	}
}
