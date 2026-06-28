package Stringfunctions;
//Write a program to convert all the letters to small letter in the given string"Manual Testing"
public class Assignment134
{
	public static void main(String[] args) 
	{
		String name = "Manual Testing";
		System.out.println("Write the length of the name:->"+name.length());
        System.out.println(name.toLowerCase());
	
    char[] c1 = name.toCharArray();
    for(int i = 0; i < c1.length; i++)
    {
        if(c1[i] >= 'A' && c1[i] <= 'Z')
        {
            c1[i] = (char)(c1[i] + 32);
        }
    }
    System.out.println(c1);
	}
}


