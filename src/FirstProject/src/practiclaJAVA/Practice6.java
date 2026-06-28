package practiclaJAVA;

import java.util.Arrays;

public class Practice6
{
  public static void main(String[] args) 
  {
	String a = "pea";
	String b ="ape";
	if(a.length()!=b.length())
	{
		System.out.println("They are never anrgam");
	}
	else
	{
		char [] c1 = a.toCharArray();
		char [] c2 = b.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		if(Arrays.equals(c1, c2))
		{
			System.out.println("yes,they are anrgam");
		}
		else
		{
			System.out.println("no, they are not anrgam");
		}
	}
}
}
