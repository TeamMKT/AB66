package stringFunctionsPractice;

public class LengthoftheString {

	public static void main(String[] args) 
	{
		String name = "Java Programming";
		System.out.println(name.length());
		String name1="Hello World";
		System.out.println(name1.toUpperCase());
		String name2="Java";
		System.out.println(name2.length());
		for(int i=0;i<=name2.length()-1;i++)
		{
			System.out.println(name2.charAt(i));
		}
		String a = "Programming";
		System.out.println(a.length());
		System.out.println(a.substring(3, 7));
		
	}

}
