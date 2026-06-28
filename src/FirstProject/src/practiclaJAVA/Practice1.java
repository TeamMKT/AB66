package practiclaJAVA;

public class Practice1 
{
   public static void main(String[] args) 
   {
	  String num = "121";
	  String reverse = "";
	  for(int i=num.length()-1; i>=0;i--)
	  {
		  char c1 = num.charAt(i);
		  reverse = reverse +c1;
	  }
	  System.out.println(" My input is:" + num);
	  System.out.println("My output is: " + reverse);
	  
	  if(num.equals(reverse))
	  {
		  System.out.println("It is a palindrome");
	  }
	  else
	  {
		  System.out.println("It is  not a palindrome");
	  }
}
}
