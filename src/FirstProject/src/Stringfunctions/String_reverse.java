package Stringfunctions;

public class String_reverse 
{
	public static void main(String[] args) 
	{
		String name = "Rudra";
		System.out.println(name.length());
		String reverse = "";
		for(int i=name.length()-1; i>=0;i--)
		{
			char c1 = name.charAt(i);
			reverse = reverse+c1;
			/*i=4,c1=a,reverse=a
		    i=3,c1=r,reverse=a+r=ar
		    i=2, c1=d,reverse=ar+d=ard
		    i=1,c1=u,reverse=ard+u=ardu
		    i=0,c1=R, reverse=ardu+r*/
		    
			System.out.println(reverse);
			
					
		}
		
	}

}
