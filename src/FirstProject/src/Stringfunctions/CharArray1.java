package Stringfunctions;

import java.util.Arrays;

public class CharArray1 {

	public static void main(String[] args)
	{
		String name = "Geeta";
		char [] a = name.toCharArray();
		for(int i=0;i< name.length();i++)
		{
			System.out.println(a[i]);
		}
          System.out.println(Arrays.toString(a));
}
}
