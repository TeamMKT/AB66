package Stringfunctions;

public class StringReverse 
{
	public static void main(String[] args) 
	{
		String name ="Kameswari";
		System.out.println("length of the name:>"+ name.length());
		String reverse = "";
		
		for( int i = name.length()-1;i>=0;i--)
		{
			char a = name.charAt(i);
			reverse = reverse + a;
			
			/*i=9; a=i;reverse=i;
			 * i=8, a=r; reverse = i+r=ir
			 * i=7; a=a; reverse = ir+a=ira
			 * i=6; a=w; reverse = ira+w=iraw
			 * i=5; a=s; reverse=iraw+s=iraws
			 * i=4; a=e; reverse=iraws+e=irawse
			 * i=3; a=m; reverse=irawse+m=irawsem
			 * i=2; a=a; reverse=irawsem+a=irawsema
			 * i=1;a=k; reverse=irawsema+k=irawsemak
			 */
		}
			System.out.println(reverse);// you can get the only out put you can print outside the loop.
		}
		

	}


