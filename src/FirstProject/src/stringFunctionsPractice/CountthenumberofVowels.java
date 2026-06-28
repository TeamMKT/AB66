package stringFunctionsPractice;

import java.util.Arrays;

public class CountthenumberofVowels {

	public static void main(String[] args) 
	{
		 int countofVowels =0;
		String name = "Java Programming";
		
		for(int i =0;i<name.length();i++)
		{
			char c1 = name.charAt(i);
			if( c1 =='a' || c1=='e' || c1=='i' || c1=='o' || c1=='u' ||
		               c1=='A' || c1=='E' || c1=='I' || c1=='O' || c1=='U')
					{
						countofVowels++;
					}
		}
		
		System.out.println("Total number of vowels:->"+ countofVowels);
		
	}

}
