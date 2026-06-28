package array_String;
//String and iterate each char present in it.
public class Practise_Forloop 
{
	public static void main(String[] args) 
	{
		String str = "School";
		int s1 = str.length();
		System.out.println(s1);
		System.out.println("In a string each character iterate:");

		for(int i=0;i<=str.length()-1;i++)
		{
			char c1 =str.charAt(i);
			System.out.println(c1);
		}
		
	}

}
