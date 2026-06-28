package stringFunctionsPractice;

public class ReverseString 
{
	public static void main(String[] args) 
	{
		String name = "Hello";
		String reverse = "";
		for(int i=name.length()-1;i>=0;i--)
		{
			char c1 = name.charAt(i);
			reverse = reverse+c1;
			
		}
		System.out.println("The reverse name is:->"+reverse);
	}

}
