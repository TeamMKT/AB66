package practiclaJAVA;

public class Practice4 
{
   public static void main(String[] args) 
   {
	String input = "DAD";
	String output = "";
	for(int i=input.length()-1;i>=0;i--)
	{
		char c1 = input.charAt(i);
		output = output +c1;
	}
	System.out.println(input);
	System.out.println(output);
	
	boolean b1 = input.equals(output);
	if(b1)
	{
		System.out.println("Palindrome");
	}
	else
	{
		System.out.println("Not palidrome");
	}
}
}
