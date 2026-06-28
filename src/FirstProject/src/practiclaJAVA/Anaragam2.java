package practiclaJAVA;

import java.util.Arrays;

public class Anaragam2 {

	public static void main(String[] args) {
		String s1 = "listen";
		String s2 = "silent";
		if(s1.length()!=s2.length())
		{
			System.out.println("They are never anargam");
		}
		else
		{
			char []c1= s1.toCharArray();
			char [] c2 = s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));
			if(Arrays.equals(c1, c2))
			{
				System.out.println("Yes, they are Anargam");
			}
			else
			{
				System.out.println("no, they are no Anrgam");
			}

			}

	}

}
