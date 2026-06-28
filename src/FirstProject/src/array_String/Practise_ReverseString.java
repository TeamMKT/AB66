package array_String;

public class Practise_ReverseString 
{
  public static void main(String[] args) 
  {
	String s1 = "School";
	String reverse = "";
	System.out.println(s1.length());
	System.out.println("Find reverse String");
	for(int i=s1.length()-1;i>=0;i--)
	{
		char c1 = s1.charAt(i);
		reverse = reverse+c1;
	}
	System.out.println(reverse);
}
}
