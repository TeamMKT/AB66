package array_String;

public class Stringrevesepractice
{
   public static void main(String[] args)
   {
	 String name = "MADAM";
	 String reverse="";
	 for(int i=name.length()-1; i>=0;i--)
	 {
		 char c1 = name.charAt(i);
		 reverse = reverse+c1;
	 }
	 System.out.println(reverse);
	 if(name.equals(reverse))
	 {
		 System.out.println("This is a palindrome");
	 }
	 else
	 {
		 System.out.println("This is not a palindrome");
	 }
}
}
