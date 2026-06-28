package Stringfunctions;

public class StringReverse_Palindrome2 
{
	public static void main(String[] args) 
	{
		String input = "MOM";
		System.out.println(input.length());
		String output = "";
		for(int i=input.length()-1; i>=0;i--)
		{
			char c1 = input.charAt(i);
			output = output+c1;
			/*i=4,c1=a,reverse=a
		    i=3,c1=r,reverse=a+r=ar
		    i=2, c1=d,reverse=ar+d=ard
		    i=1,c1=u,reverse=ard+u=ardu
		    i=0,c1=R, reverse=ardu+r*/
		}
		   System.out.println("My input is- >"+input);
		   System.out.println("My out put is - >"+output);
			if(input.equals(output))
			{
				System.out.println("This is a palindrome");
			}
			else
			{
				System.out.println("This is not a palindrome");
				
			}
					
		}
		
	}


